package Madiator;

public class Mediator implements IMediator {

    @Override
    public void mediate(String className) {
        switch (className){

            case "SearchBtn":
                System.out.println("search");
        }
    }
}
