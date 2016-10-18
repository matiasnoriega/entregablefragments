package abda.com.integradorfragments.recetas;

import android.content.Intent;

import java.util.*;

import abda.com.integradorfragments.R;

/**
 * Created by digitalhouse on 17/10/16.
 */
public class Receta {

    private String nombre;
    private String descripcion;
    private String resumen;
    private String resumenCorto;
    private Integer fotoId;

    public Receta(String nombre, String resumen, String descripcion, Integer fotoId) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.resumen = resumen;
        this.resumenCorto = resumen.substring(0, 100)+"...";
        this.fotoId = fotoId;
    }

    public static List<Receta> devolverListaRecetas(){
        List<Receta> listaADevolver = new ArrayList<Receta>();

        Receta receta1 = new Receta("Eclair o palo jacob", "El ecláir es un dulce de la pastelería clásica francesa, cuyo origen se remonta al siglo XIX. Su denominación original se traduce como relámpago. Se cree que recibió este nombre por la forma como brilla.", "En una cacerola ponemos agua, sal y manteca. Llevamos al fuego.\n" +
                "        Cuando rompe el hervor agregamos toda la harina y comenzamos a revolver con cuchara de madera enérgicamente para unir todo.\n" +
                "        Bajamos el fuego al mínimo y seguimos revolviendo unos cinco minutos más.\n" +
                "        Retiramos, pasamos a un bol y dejamos reposar 5 minutos.\n" +
                "        Comenzamos a agregar los huevos de a uno, siempre batiendo. Parece que se corta, pero luego se va uniendo todo.\n" +
                "        Si hacemos un camino con el dedo y la preparación no se junta, ya tenemos la masa lista.\n" +
                "        Colocamos la preparación en una manga con pico liso y formamos los palos de unos doce centímetros de largo, que ubicamos sobre una placa enmantecada y enharinada a bastante distancia entre ellos para que no se peguen, ya que al cocinarlos aumentan considerablemente de tamaño.\n" +
                "        Llevamos a un horno a 200ºC de 15 a 20 minutos hasta que estén bien inflados. Terminamos de secar en un horno a 160ºC durante unos 20 minutos más. El tiempo de cocción depende del tamaño. Se suele hacer también con dos o tres lineas de masa colocadas una junto a otra y la tercera arriba.\n" +
                "        Apagamos el horno y dejamos que se enfríen dentro del mismo.", R.drawable.eclair);

        Receta receta2 = new Receta("Tarta de berenjenas", "Si tenemos en cuenta el tiempo que demora un delivery en traernos el pedido, bien podemos en ese tiempo hacer una tarta, pues su preparación es simple y de paso nos ahorramos unos pesos.", "Cortamos las berenjenas en cubos pequeños. Colocamos en una sartén con un chorro de aceite y vamos revolviendo para que se cocinen todos parejos.\n" +
                "    Pasados unos 5 minutos agregamos zanahoria, ajo y cebolla, ambos picados.\n" +
                "    Cocinamos otros 5 minutos más, retiramos y dejamos enfriar. Agregamos los huevos, queso y salpimentamos. Revolvemos bien para unir todo.\n" +
                "    Colocamos una de las masas en la base de la tartera, distribuimos la preparación y tapamos con otra masa.\n" +
                "    Pinchamos en varios lados y llevamos a horno a 170 ºC por 20 minutos o hasta que esté bien doradita.", R.drawable.tarta);

        Receta receta3 = new Receta("Matambre relleno", "Este corte de carne vacuna que está ubicado entre el cuero y el costillar del animal, es muy consumido en nuestro país para las fiestas de fin de año y durante la temporada de verano en forma de arrollado.","    Picamos los pimientos, cebolla y zanahoria.\n" +
                "    Estiramos el matambre sobre un papel aluminio. Salpimentamos y untamos con mostaza.\n" +
                "    Imaginariamente dividimos en dos partes y en una de ellas distribuimos la zanahoria, pimientos y la mitad del queso rallado.\n" +
                "    Repetimos los condimentos y terminamos con una capa de queso rallado.\n" +
                "    Con la otra mitad del matambre cerramos (tipo sobre) con palillos para que no se abra. Ver foto.\n" +
                "    Envolvemos con el papel aluminio, cerrando bien los bordes.\n" +
                "    Colocamos en una fuente y llevamos a un horno precalentado a 170 ºC por 60 minutos.", R.drawable.matambre);

        Receta receta4 = new Receta("Tostadas lactales", "El pan es un alimento básico para los argentinos y por ello, no puede faltar en cada mesa, ya sea fresco o tostado. Podemos elegir el pan o la tostada, que sin duda son del agrado de todos e infaltable en cada desayuno para iniciar el día con energía.", "En un bol ponemos las ¾ partes de la harina. En el centro colocamos la leche en polvo, sal, azúcar, malta, levadura y manteca. Con la mano vamos tomando la masa mientras agregamos el agua tibia formando una masa tierna.\n" +
                "    Llevamos a la mesada espolvoreada con poca cantidad de harina y amasamos por unos diez minutos, sin romper la masa, con movimientos de derecha a izquierda, apretando con la parte final de la palma de la mano (junto a la muñeca). Pasado ese tiempo debe quedar una masa lisa y tierna.\n" +
                "    Llevamos al bol y cubrimos con papel film hasta que duplique su volumen.\n" +
                "    Luego desgasificamos y estiramos en forma rectangular.\n" +
                "    De un extremo vamos enrollando, apretando bien con los dedos el borde de la parte de adentro. Al finalizar colocamos en un molde de budín o alargado (para dar la forma deseada), enmantecados o con rocío vegetal.\n" +
                "    Presionamos bien la masa para que tome la forma del molde. Con un palito de brochete o similar, pinchamos en varias partes para sacarle el aire.\n" +
                "    Dejamos leudar hasta que duplique su volumen.\n" +
                "    Pintamos con huevo mezclado con un poquito de leche y llevamos a un horno a 170 ºC por unos 35 minutos.\n" +
                "    Una vez bien doradito, retiramos y podemos volver a pintar.\n" +
                "    Una vez frío cortamos en rodajas finas y acomodamos en una bandeja para horno.\n" +
                "    Llevamos a un horno a 170ºC por unos 7 minutos. Deben quedar doraditas de los dos lados. En mi caso yo las tuve que dar vuelta.", R.drawable.tostadas);

        Receta receta5 = new Receta("Torrejitas de fideos", "En el más de medio siglo de vida, recuerdo que ha habido en el país en varias oportunidades momentos de crisis, donde nos veíamos obligados a hacer economía para que el sueldo alcance hasta fin de mes. En esos momentos difíciles es donde realmente se aprende a no desperdiciar nada. De allí que siguiendo con la costumbre de otras épocas yo no tiro nada.", " Colocamos los fideos en un bol y agregamos el queso, huevos, cebolla picada bien chiquita, el ajo picado (puede ser una cucharadita de ajo en aceite link), los condimentos y por último la harina mezclada con el polvo de hornear.\n" +
                "    Unimos bien. Si la preparación queda un poco dura le agregamos un huevo más o un poquito de leche.\n" +
                "    En un recipiente chico pero profundo, colocamos bastante aceite y llevamos al fuego. Cuando el aceite está caliente mojamos la cuchara en el mismo, tomamos porciones y con la ayuda de otra cuchara vamos formando las torrejitas.", R.drawable.torrejitas);

        Receta receta6 = new Receta("Trenza de papa y panceta", "El formato que le demos es lo menos importante de esta receta, por lo que se puede utilizar cualquier molde que tengamos a mano. La presentación queda en un segundo plano, porque lo importante es su sabor y textura.", "   En un bol ponemos las ¾ parte de la harina. En el centro ponemos la levadura, el azúcar y un poco de agua para disolver la levadura. Ver fotos.\n" +
                "    Dejamos reposar unos 10 minutos.\n" +
                "    Picamos y doramos la panceta, solo para eliminar parte de la grasa que tiene.\n" +
                "    Pasado los 10 minutos agregamos la manteca pomada, la leche y la panceta. Comenzamos a agregar de a poco el agua tibia mientras vamos tomando con la mano todos los ingredientes y formando una masa tierna. Si fuese necesario se puede agregar un poquito mas de agua.\n" +
                "    Una vez formada la masa la bajamos a la mesa o mesada espolvoreada con un poquito de la harina que había reservado y amasamos por unos diez minutos, sin romper la masa, con movimientos de derecha a izquierda, apretando con la parte final de la palma de la mano (junto a la muñeca). Pasado ese tiempo debe quedar una masa lisa y tierna.\n" +
                "    Llevamos al bol y cubrimos con papel film hasta que duplique su volúmen.\n" +
                "    Dividimos la masa en dos partes para hacer dos trenzas.\n" +
                "    Con cada una hacemos tres tiras y formamos una trenza.\n" +
                "    Colocamos en una placa para horno con rocío vegetal o un poquito de aceite. Dejamos que duplique su volúmen.\n" +
                "    Pintamos con huevo batido mezclado con un chorrito de leche.\n" +
                "    Llevamos a un horno a 170 º C por unos 35 minutos o hasta que estén bien doraditos.\n" +
                "    Ni bien las saquemos del horno volvemos a pasarle huevo batido.\n", R.drawable.trenzapapa);
        Receta receta7 = new Receta("Suprema de pollo a la Maryland", "Se trata de una milanesa frita de pollo que se sirve con distintas guarniciones. Por aquí quedaron las bananas y el choclo como toque que suma dulzura al plato.", " La suprema se logra de sacar las dos partes al costado del esqueleto del pecho(pechuga) del pollo. Cada una de las mismas se corta cuidadosamente con un cuchillo en dos mitades para que queden más delgadas. Se aplana y ya esta lista.\n" +
                "    Preparamos la suprema de la misma forma que una milanesa, es decir, rebozamos pasándolas por huevo batido con los condimentos que nos gusten y pan rallado, aplastando fuertemente con la palma de la mano. Reservamos.\n" +
                "    Pelamos las bananas, pasamos por jugo de limón (para que no se oxiden y se pongan oscuras). Pasamos por harina, huevo y pan rallado. Reservamos.\n" +
                "    En una sartén con un chorrito de aceite o una cucharadita de manteca, colocamos el ajo y la cebolla picados bien chiquito. Llevamos al fuego por 5 minutos. Incorporamos choclo, leche, harina y salpimentamos. Revolvemos y cocinamos otros 5 minutos.\n" +
                "    Por último agregamos el queso rallado y dejamos en fuego bajo unos minutos más para que espese y tome cuerpo.\n" +
                "    Mientras se va cocinando esta crema de choclo, freímos las bananas en abundante aceite caliente hasta que se doren suavemente de ambos lados. Retiramos y colocamos en una bandeja con papel absorbente.\n" +
                "    A continuación freímos las supremas en aceite caliente hasta que se doren ligeramente de ambos lados, cuidando que queden bien cocidas por dentro. Escurrimos en una bandeja con papel absorbente para que queden sequitas.\n" +
                "    Servimos inmediatamente. Para ello disponemos las supremas en platos individuales (una en cada plato) acompañada con una banana frita, un huevo frito y una porción de la crema de choclo.", R.drawable.maryland);

        listaADevolver.add(receta1);
        listaADevolver.add(receta2);
        listaADevolver.add(receta3);
        listaADevolver.add(receta4);
        listaADevolver.add(receta5);
        listaADevolver.add(receta6);
        listaADevolver.add(receta7);

        return listaADevolver;

    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getResumen() {
        return resumen;
    }

    public String getResumenCorto() {
        return resumenCorto;
    }

    public Integer getFotoId() {
        return fotoId;
    }
}
