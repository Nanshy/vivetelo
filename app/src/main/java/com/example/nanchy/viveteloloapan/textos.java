package com.example.nanchy.viveteloloapan;

import android.support.annotation.NonNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Nanchita n_n on 10/04/2016.
 */
public class textos {

    public static String mensajes (int fila, int columna)
        {
            String [][] v = new String[3][25];
            v[0][0] = "ACERCA DE";
            v[1][0] = "ABOUT OF";
            v[2][0] = "À PROPOS DE";

            v[0][1] = "MONUMENTOS";
            v[1][1] = "MONUMENTS";
            v[2][1] = "SPECTACLES";

            v[0][2] = "RESTAURANTES";
            v[1][2] = "RESTAURANTS";
            v[2][2] = "RESTAURANTS";

           v[0][3] = "ALOJAMIENTO";
            v[1][3] = "HOTELS";
            v[2][3] = "HOTELS";

            v[0][4] = "ARTESANIA";
            v[1][4] = "CRAFTS";
            v[2][4] = "ARTISANAT";

            v[0][5] = "GASTRONOMIA";
            v[1][5] = "GASTRONOMY";
            v[2][5] = "GOURMANDISE";

            v[0][6] = "HOME";
            v[1][6] = "HOME";
            v[2][6] = "ACCUEIL";

            v[0][7] = "AGENDA";
            v[1][7] = "DIARY";
            v[2][7] = "L 'AGENDA";

            v[0][8] = "LUGARES CERCANOS";
            v[1][8] = "NEARBY PLACES";
            v[2][8] = "LIEUX PROCHES";

            v[0][9] = "AYUDA";
            v[1][9] = "HELP";
            v[2][9] = "AIDE";

            v[0][10] = "IDIOMAS";
            v[1][10] = "LANGUAGES";
            v[2][10] = "LANGUES";

            v[0][11] = "Teloloapan es una ciudad mexicana del estado de Guerrero. Está enclavada en el corazón de la Sierra Madre del Sur en la región norte del dicha entidad. Es cabecera del municipio homónimo. Actualmente Teloloapan cuenta con 19 colonias y 141 comisarías, por lo que es el Municipio más grande del Estado de Guerrero.";
            v[1][11] = "Teloloapan is a Mexican city of Guerrero state. It is nestled in the heart of the Sierra Madre del Sur in the northern region of that entity. He is head of the homonymous municipality. Teloloapan currently has 19 colonies and 141 police stations, so is the state of Guerrero largest municipality.";
            v[2][11] = "Teloloapan est une ville mexicaine de l'État de Guerrero. Il est niché au cœur de la Sierra Madre del Sur dans la région nord de cette entité. Il est responsable de la municipalité du même nom. Teloloapan compte actuellement 19 colonies et 141 postes de police, est donc l'état de Guerrero grande municipalité.";

            v[0][12] = "La tradición oral relata que los primeros pobladores de Teloloapan fueron los Cohuixcas, quienes tuvieron que luchar contra los Chontales, los que no permitían su establecimiento definitivo en estas tierras. Los Cohuixcas poseían las siguientes características: altos,morenos, usaban trenzas, eran huraños, implacables y agresivos.Los tres grandes grupos que llegaron en diferentes épocas a la región norte de nuestro Estado, fueron los Chontales, los Nahuas y los Izucas y los Mexicas. Los Cohuixcas se dedicaron a la agricultura. Sus principales sembradíos eran el maíz, la calabaza, el cacao, entre otros. Sus dominios se extendian hasta lo que hoy se conoce con el nombre de Chapa, pequeña comunidad poseedora de un manantial de agua que surte a la Cabecera Municipal del preciado líquido.Se afirma que cuando el reino de Mexicapan estaba en pleno apogeo, llegaron los Tenochcas quienes arrazaron materialmente a esta población, llevandose muchos prisioneros a la Capital Azteca, dejando el libertad únicamente a los ancianos, mujeres y niños. Probablemente a raíz de la conquista realizada por los Mexicas, los Cohuixcas cambiaron sus habitaciónes un poco hacia el sur, para dar orígen a la Ciudad de las Tecampanas, de maravillosos paisajes y agradabilísimo clima.Se tiene indicios de que las primeras construcciónes de nuestro Teloloapan, se realizaron en el año 700 d.C. por las tribus indígenas. Fué hasta el 23 de junio de 1871, cuando fué eregida Ciudad, por el entonces Gobernador del Estado, el Gral. Francisco O. Arce. Teloloapan es Cabecera Municipal y del Distrito Judicial de Aldama. Años más tarde, el 1° de mayo, cedió parte de su territorio para formar el Mpio. de Cuetzal a. Después, el 23 de diciembre de 1953, donó otra parte para constituir el Municipio. de Canuto A. Neri.";
            v[1][12] = "The oral tradition relates that the first settlers were the Cohuixcas Teloloapan, who had to fight Chontales, which did not allow definitive establishment in these lands. The Cohuixcas had the following characteristics: tall, dark, wore braids, were sullen, implacable and agresivos.Los three large groups arrived at different times to the northern region of our state were the Chontales, the Nahua and Izucas and Mexica . The Cohuixcas devoted to agriculture. Their main crops were corn, squash, cacao, among others. His dominions extended to what is now known Chapa, possessing a small water spring that supplies the Municipal Head of precious líquido.Se states that when the kingdom of Mexicapan was thriving community, came the Tenochcas who they arrazaron materially to this population, taking many prisoners to the Capital Azteca, leaving the freedom only the elderly, women and children. Probably following the conquest by the Mexica, the Cohuixcas changed their rooms a little to the south, to give origin to the City of Tecampanas, wonderful scenery and very pleasant weather.Se has evidence that the first constructions of our Teloloapan , they were performed in 700 AD by indigenous tribes. It was until June 23, 1871, when it was erected City, by the then Governor, General. Francisco O. Arce. Teloloapan is Municipal and District Judicial Aldama header. Years later, on May 1, he ceded part of its territory to form the Municipality of Cuetzal a. After the December 23, 1953, he donated another party to form the Municipality. of Canute.";
            v[2][12] = "La tradition orale rapporte que les premiers colons étaient les Teloloapan Cohuixcas, qui a dû se battre Chontales, qui ne permettait pas l'établissement définitif de ces terres. Les Cohuixcas avaient les caractéristiques suivantes: grand, sombre, portait des tresses, étaient maussades, implacable et agresivos.Los trois grands groupes sont arrivés à des moments différents de la région nord de notre état étaient les Chontales, les Nahua et Izucas et Mexica . Les Cohuixcas consacrés à l'agriculture. Leurs principales cultures étaient le maïs, la courge, le cacao, entre autres. Ses dominions étendus à Chapa ce qui est maintenant connu, possédant une petite source d'eau qui alimente le chef municipal de líquido.Se précieux stipule que lorsque le royaume de Mexicapan était florissante communauté, est venu les Tenochcas qui ils arrazaron matériellement à cette population, en prenant beaucoup de prisonniers à l'Azteca Capital, en laissant la liberté que les personnes âgées, les femmes et les enfants. Probablement après la conquête par le Mexica, les Cohuixcas changé leurs chambres un peu vers le sud, pour donner naissance à la ville de Tecampanas, paysages merveilleux et clima.Se très agréable a la preuve que les premières constructions de notre Teloloapan , ils ont été effectuées en 700 après JC par les tribus indigènes. Il était jusqu'au 23 Juin 1871, quand il a été érigé la ville, par le Gouverneur général. Francisco O. Arce. Teloloapan est-tête municipal et du district judiciaire Aldama. Des années plus tard, le 1er mai, il a cédé une partie de son territoire pour former le Mpio. d'un Cuetzal. Après 23 Décembre 1953, il a fait don une autre partie pour former la municipalité. de Canute.";

            v[0][13] = "ACERCA DE TELOLOAPAN";
            v[1][13] = "ABOUT OF TELOLOAPAN";
            v[2][13] = "À PROPOS DE TELOLOAPAN";

            v[0][14] = "HISTORIA";
            v[1][14] = "HISTORY";
            v[2][14] = "HISTOIRE";

            v[0][15] = "MONUMENTOS";
            v[1][15] = "MONUMENTS";
            v[2][15] = "SPECTACLES";

            v[0][16] = "RESTAURANTES";
            v[1][16] = "RESTAURANTS";
            v[2][16] = "RESTAURANTS";

            v[0][17] = "ALOJAMIENTO";
            v[1][17] = "HOTELS";
            v[2][17] = "HOTELS";

            v[0][18] = "ARTESANIA";
            v[1][18] = "CRAFTS";
            v[2][18] = "ARTISANAT";

            v[0][19] = "GASTRONOMIA";
            v[1][19] = "GASTRONOMY";
            v[2][19] = "GOURMANDISE";

            v[0][20] = "AGENDA";
            v[1][20] = "DIARY";
            v[2][20] = "L 'AGENDA";

            v[0][21] = "LUGARES CERCANOS";
            v[1][21] = "NEARBY PLACES";
            v[2][21] = "LIEUX PROCHES";

            v[0][22] = "AYUDA";
            v[1][22] = "HELP";
            v[2][22] = "AIDE";

            v[0][23] = "¿No sabes como utilizar la aplicaciòn?";
            v[1][23] = "You do not know how to use the application?";
            v[2][23] = "Vous ne savez pas comment utiliser l'application ?";

            v[0][24] = "A continuaciòn se muestra una lista de preguntas frecuentes que podràn prientarte para un mejor uso de la aplicacion";
            v[1][24] = "Below is a list of frequently asked questions that may prientarte for better use of the application is shown";
            v[2][24] = "Voici une liste de questions fréquemment posées qui peuvent prientarte pour une meilleure utilisation de l'application est indiquée";



            return v[fila][columna];
        }
    public static int indice_lenguaje= 0;

}