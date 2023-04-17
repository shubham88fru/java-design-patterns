package mosh.mediator;

public class ArticlesDialogBox{
    private final ListBox articlesListBox = new ListBox();
    private final TextBox titleTextBox = new TextBox();
    private final Button saveButton = new Button();

    public ArticlesDialogBox () {
        articlesListBox.addEventHandler(this::articleSelected);
        titleTextBox.addEventHandler(this::titleChanged);
    }

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

    private void articleSelected() {
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }

    private void titleChanged() {
        boolean isEmpty = titleTextBox.getContent() == null || titleTextBox.getContent().isEmpty();
        saveButton.setEnabled(!isEmpty);
    }
}
