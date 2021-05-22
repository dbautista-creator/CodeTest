import java.util.ArrayList;
import java.util.Arrays;

public class City{

	private String choiceOfCity;
	private ArrayList<String> cityDatabase = new ArrayList();
	static boolean isTrue = false;

	public City(String name){
		name = this.choiceOfCity; 
		for(int index = 0; index< cityDatabase.size();index++){
			if(cityDatabase.contains(name)){
				System.out.println(name);
				isTrue = true;
			}
		}
	}

    /**
     * @return String return the choiceOfCity
     */
    public String getChoiceOfCity() {
        return choiceOfCity;
    }

    /**
     * @param choiceOfCity the choiceOfCity to set
     */
    public void setChoiceOfCity(String choiceOfCity) {
        this.choiceOfCity = choiceOfCity;
    }
	public String dataBase(){
		cityDatabase.addAll(Arrays.asList("A Coruña"));


		return "I should have spent more time iworking on the interface";
	}
}
