package  com.example.viewpagertp;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

public class Group implements Serializable {
    private List<Stagiaire> lststagiaire = new ArrayList<Stagiaire>();
    private String nameGroup;
    private int annee;
    private Filiere filiere;
    private String code;
    private int numberStudent = lststagiaire.size();
    public Group(String namegroup, int numberstudent, int annee, Filiere filiere, String code){
        this.nameGroup = namegroup;
        this.numberStudent = numberstudent;
        this.code = code;
        this.annee = annee;
        this.filiere = filiere;
    }
    public void setLststagiaire(List<Stagiaire> lststagiaire){
        this.lststagiaire = lststagiaire;
    }
    public List<Stagiaire> getLststagiaire(){
        return lststagiaire;
    }
    public void setAnnee(int annee){
        this.annee = annee;
    }
    public int getAnnee(){
        return annee;
    }
    public void setFiliere(Filiere filiere){
        this.filiere = filiere;
    }
    public Filiere getFiliere(){
        return filiere;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCode(){
        return code;
    }
    public void setNameGroup(String nameGroup){
        this.nameGroup = nameGroup;
    }
    public String getNameGroup(){
        return nameGroup;
    }
    public void setNumberStudent(int number){
        this.numberStudent = number;
    }
    public int getNumberStudent(){
        return numberStudent;
    }
}
