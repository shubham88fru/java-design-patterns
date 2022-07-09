package momento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        //type `a` and save
        editor.setContent("a");
        history.push(editor.createState());

        //type `b` and save
        editor.setContent("b");
        history.push(editor.createState());

        //oops need to undo `c`
        editor.setContent("c");
        editor.restore(history.pop());
        System.out.println(editor.getContent());

        editor.restore(history.pop());
        System.out.println(editor.getContent());
    }
}
