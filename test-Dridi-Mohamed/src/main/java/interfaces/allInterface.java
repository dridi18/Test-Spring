package interfaces;

import com.esprit.demoproject.enums.TypeMenu;
import entities.Client;
import entities.Composant;
import entities.Menu;
import entities.Restaurant;

import java.util.List;

public interface allInterface {

     Client ajouterClient(Client client);

     Restaurant ajouterRestaurantEtMenusAssocie(Restaurant restaurant);

     Menu ajoutComposantsEtMiseAJourPrixTotalMenu(List<Composant> composants,Long idMenu);

     void affecterClientAuMenu(String identifant,String libelleMenu);

     List<String> libelleMenuParTypeMenuordonneParPrixTotal(TypeMenu typeMenu);

     void menuPlusCommand();

}
