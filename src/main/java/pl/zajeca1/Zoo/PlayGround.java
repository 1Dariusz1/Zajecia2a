package pl.zajeca1.Zoo;

        import java.util.HashMap;
        import java.util.Map;

public class PlayGround {


//    private



    private Map<String, Bear> participants = new HashMap<>();
    public void register(Bear bear) {
        bear.attack(this);

    }

}
