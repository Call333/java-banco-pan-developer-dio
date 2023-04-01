

class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro(20, "Pálio", "Branco");
        c1.encherTanque(5.99);
        System.out.println(c1.getCapacidadeTanque());
        System.out.println(c1.getModelo());
        System.out.println(c1.getCor());
        System.out.println(c1.getValor_encher_tanque());

        System.out.println("\n--------Carro 02--------\n");

        Carro c2 = new Carro();
        c2.setCor("Amarelo");
        c2.setModelo("Jeep Renegade");
        c2.setCapacidadeTanque(35);
        System.out.println(c2.getCapacidadeTanque());
        System.out.println(c2.getModelo());
        System.out.println(c2.getCor());
        c2.encherTanque(5.99);
        System.out.println(c2.getValor_encher_tanque());
    }
}