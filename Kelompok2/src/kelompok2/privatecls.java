package kelompok2;

public class privatecls {
    private String kelas;
    
    public void setKls(String Kelas){
        this.kelas=Kelas;
    }
    
    public String getkls(){
        return this.kelas;
    }
    
    public static void main(String[] args) {
       privatecls kelass = new privatecls();
       kelass.kelas = "1IA01"; 
    }
  
}
