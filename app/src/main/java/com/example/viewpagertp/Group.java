package  com.example.viewpagertp;
import java.util.List;

public class Group {
    public List<Stagiaire> lststagiaire;
    private String nameGroup;
    private int annee;
    private Filiere filiere;
    private String code;
    private int numberStudent = lststagiaire.size();
    public Group(String namegroup, int numberstudent){
        this.nameGroup = namegroup;
        this.numberStudent = numberstudent;
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
}
