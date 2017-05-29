package josegonzalez.hephaesus.main;

/**.___
 * Created by Jose Gonzalez
 __.*/
public abstract class JsonModel {

    protected long id;
    protected String name;

    public String getItemName(){
        return name;
    }

    public long getItemId(){
        return id;
    }

}
//.___ End of JsonModel __./
