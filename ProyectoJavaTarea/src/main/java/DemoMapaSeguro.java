public class DemoMapaSeguro {
    public static void main(String[] args) {

        MapaSeguro<String, String> mapa = new MapaSeguro<>();

        mapa.put("clave1", "valor1");

         mapa.put("clave2", null); // al correr la demo el sistema arrojara una excepcion

        System.out.println(mapa);
    }
}