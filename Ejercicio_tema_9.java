class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Miguel");
        cliente1.setEdad(20);
        cliente1.setTelefono(987654321);
        cliente1.setCredito(3000);

        Trabajador trabajador1 = new Trabajador();
        trabajador1.setNombre("Angel");
        trabajador1.setEdad(30);
        trabajador1.setTelefono(887654321);
        trabajador1.setSalario(2000);
        


        System.out.println("nombre del cliente : "+cliente1.getNombre());
        System.out.println("Edad del cliente :"+ cliente1.getEdad());
        System.out.println("telefono del cliente : "+cliente1.getTelefono());
        System.out.println("credito disponible del cleinte : $ "+cliente1.getCredito());
        System.out.println("  ");
        System.out.println("nombre del trabajador : "+ trabajador1.getNombre());
        System.out.println("Edad del trabajador :"+ trabajador1.getEdad());
        System.out.println("telefono del trabajador : "+trabajador1.getTelefono() );
        System.out.println("salario del trabajador : $ "+ trabajador1.getSalario());


    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
          this.edad=edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(int telefono){
    this.telefono=telefono;
    }
    public int getTelefono(){
        return this.telefono;
}
}


class Cliente extends Persona{
    private int credito;

    public void setCredito(int credito){
         this.credito=credito;
    }
    public int getCredito(){
        return credito;
    }
}

class Trabajador extends Persona{
    private int salario;
    
    public void setSalario(int salario){
        this.salario=salario;
    }
    public int getSalario(){
        return salario;
    }
}