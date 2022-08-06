package mediator;

public class ArticlesDialogBox extends DialogBox{
    private final ListBox articlesListBox = new ListBox(this);
    private final TextBox titleTextBox = new TextBox(this);
    private final Button saveButton = new Button(this);

    public void simulateUserInteraction() {
        articlesListBox.setSelection("article 1");
        System.out.println("TextBox: "+ titleTextBox.getContent());
        System.out.println("Button: "+ saveButton.isEnabled());

        System.out.println("--------------");
        titleTextBox.setContent("");
        System.out.println("TextBox: "+ titleTextBox.getContent());
        System.out.println("Button: "+ saveButton.isEnabled());

        System.out.println("--------------");
        titleTextBox.setContent("Article 2");
        System.out.println("TextBox: "+ titleTextBox.getContent());
        System.out.println("Button: "+ saveButton.isEnabled());



    }

    @Override
    public void changed(UIControl control) {
        if (control == articlesListBox) articleSelected();
        else if (control == titleTextBox) titleChanged();
    }

    private void articleSelected() {
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }

    private void titleChanged() {
        boolean isEmpty = titleTextBox.getContent() == null || titleTextBox.getContent().isEmpty();
        saveButton.setEnabled(!isEmpty);
    }
}
