public class corridore extends Thread {
private String nome;

public void setNome(String nome){
    this.nome = nome;
}

public String getNome(){
   return nome; 
}

public corridore(String nome){
    this.nome = nome;
}

@Override
public String toString() {
    return "corridore [nome=" + nome + "]";
}

public void run(){
    for(int  i=0; i<=100; i++){
        System.out.println(nome+" => "+i+" metri");
        try{
            Thread.sleep(100);
        }catch(Exception e){
            
        }
        
}
System.out.println("il corridore "+nome+" è arrivato: ");
}
}
