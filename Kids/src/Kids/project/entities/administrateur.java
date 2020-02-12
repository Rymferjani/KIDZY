
package kids.project.entities;


public class administrateur extends personne{

    public administrateur(int id, String login, String password, String nom, String prenom, String image, String cin, String tel, String role) {
        super(id, login, password, nom, prenom, image, cin, tel, role);
    }

    public administrateur(String login, String password, String nom, String prenom, String image, String cin, String tel, String role) {
        super(login, password, nom, prenom, image, cin, tel, role);
    }

    
    
    
    
}
