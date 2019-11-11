import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {

    private Map<Bird, ArrayList<String>> obs;

    public RingingCentre(){
        this.obs = new HashMap<Bird,ArrayList<String>>();
    }

    public void observe(Bird bird, String place){
        ArrayList<String> placesSeen = obs.get(bird);

        if(placesSeen == null){
            placesSeen = new ArrayList<String>();
            placesSeen.add(place);
            obs.put(bird,placesSeen);
        }else{
            if(!placesSeen.contains(place)){
                placesSeen.add(place);
            }
        }

    }

    public void observations(Bird bird){

        try {
            System.out.println(bird + " observations: " + obs.get(bird).size());
            for (String string : obs.get(bird)) {
                System.out.println(string);
            }
        } catch(Exception e){
            System.out.println(bird + " observations: 0");
        }
    }
}
