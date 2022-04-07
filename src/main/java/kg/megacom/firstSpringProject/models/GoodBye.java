package kg.megacom.firstSpringProject.models;

public class GoodBye {

    private Long id;
    private String goodBy;
    private Greeting greeting;

    public GoodBye(Long id, String goodBy, Greeting greeting) {
        this.id = id;
        this.goodBy = goodBy;
        this.greeting = greeting;
    }

    public GoodBye() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodBy() {
        return goodBy;
    }

    public void setGoodBy(String goodBy) {
        this.goodBy = goodBy;
    }

    public Greeting getGreeting() {
        return greeting;
    }

    public void setGreeting(Greeting greeting) {
        this.greeting = greeting;
    }
}
