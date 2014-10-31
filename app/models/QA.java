package models;

import java.util.ArrayList;
import java.util.List;

public class QA {

    private String category;
    private String question;
    private String answer;

    public QA(){}

    public QA(String category, String question, String answer){
        this.category = category;
        this.question = question;
        this.answer = answer;
    }

    public String getCategory() {
        return category;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public List<QA> getList(){
        ArrayList<QA> list = new ArrayList<>();
        list.add(new QA( "basic",
                "question",
                "answer"
        ));
        list.add(new QA( "basic",
                "question",
                "answer"
        ));
        list.add(new QA( "basic",
                "question",
                "answer"
        ));
        list.add(new QA( "basic",
                "question",
                "answer"
        ));
        list.add(new QA( "advanced",
                "question",
                "answer"
        ));
        list.add(new QA( "admin",
                "question",
                "answer"
        ));
        return list;
    }

}
