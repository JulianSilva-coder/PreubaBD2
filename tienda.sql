PGDMP     :    ,                z            Tienda    14.4    14.4 *    2           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            3           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            4           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            5           1262    16613    Tienda    DATABASE     g   CREATE DATABASE "Tienda" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Spanish_Colombia.1252';
    DROP DATABASE "Tienda";
                postgres    false            ?            1259    16663    arl    TABLE     W   CREATE TABLE public.arl (
    id integer NOT NULL,
    nombre character varying(15)
);
    DROP TABLE public.arl;
       public         heap    postgres    false            ?            1259    16703    cargo    TABLE     }   CREATE TABLE public.cargo (
    id integer NOT NULL,
    nombre character varying(36),
    c_dependencia integer NOT NULL
);
    DROP TABLE public.cargo;
       public         heap    postgres    false            ?            1259    16678    dependencia    TABLE     _   CREATE TABLE public.dependencia (
    id integer NOT NULL,
    nombre character varying(15)
);
    DROP TABLE public.dependencia;
       public         heap    postgres    false            ?            1259    16638    dias_no_trabajados    TABLE     ?   CREATE TABLE public.dias_no_trabajados (
    id integer NOT NULL,
    c_incapacidad integer NOT NULL,
    c_vacaciones integer NOT NULL,
    n_incapacidad character varying(2),
    n_vacaciones character varying(2),
    numero_dias_vacaciones integer
);
 &   DROP TABLE public.dias_no_trabajados;
       public         heap    postgres    false            ?            1259    16839    empleado    TABLE       CREATE TABLE public.empleado (
    id integer NOT NULL,
    nombre character varying(35),
    sueldo integer,
    fecha_ingreso date,
    bonificacion integer,
    transporte integer,
    c_dependencia integer,
    c_pension integer,
    c_eps integer,
    c_arl integer
);
    DROP TABLE public.empleado;
       public         heap    postgres    false            ?            1259    16668    eps    TABLE     W   CREATE TABLE public.eps (
    id integer NOT NULL,
    nombre character varying(15)
);
    DROP TABLE public.eps;
       public         heap    postgres    false            ?            1259    16614    fecha_incapacidad    TABLE     ?   CREATE TABLE public.fecha_incapacidad (
    id integer NOT NULL,
    inicio date,
    fin date,
    numero_dias_incapacidad_mes integer
);
 %   DROP TABLE public.fecha_incapacidad;
       public         heap    postgres    false            ?            1259    16633    fecha_vacaciones    TABLE     ?   CREATE TABLE public.fecha_vacaciones (
    id integer NOT NULL,
    inicio date,
    fin date,
    numero_dias_vacaciones integer
);
 $   DROP TABLE public.fecha_vacaciones;
       public         heap    postgres    false            ?            1259    16653    novedad    TABLE     ?   CREATE TABLE public.novedad (
    id integer NOT NULL,
    fecha_ingreso date,
    n_dias_trabajados_mes integer NOT NULL,
    c_no_trabajo integer NOT NULL
);
    DROP TABLE public.novedad;
       public         heap    postgres    false            ?            1259    16673    pension    TABLE     [   CREATE TABLE public.pension (
    id integer NOT NULL,
    nombre character varying(15)
);
    DROP TABLE public.pension;
       public         heap    postgres    false            *          0    16663    arl 
   TABLE DATA           )   COPY public.arl (id, nombre) FROM stdin;
    public          postgres    false    213   ?0       .          0    16703    cargo 
   TABLE DATA           :   COPY public.cargo (id, nombre, c_dependencia) FROM stdin;
    public          postgres    false    217   1       -          0    16678    dependencia 
   TABLE DATA           1   COPY public.dependencia (id, nombre) FROM stdin;
    public          postgres    false    216   ?1       (          0    16638    dias_no_trabajados 
   TABLE DATA           ?   COPY public.dias_no_trabajados (id, c_incapacidad, c_vacaciones, n_incapacidad, n_vacaciones, numero_dias_vacaciones) FROM stdin;
    public          postgres    false    211   P2       /          0    16839    empleado 
   TABLE DATA           ?   COPY public.empleado (id, nombre, sueldo, fecha_ingreso, bonificacion, transporte, c_dependencia, c_pension, c_eps, c_arl) FROM stdin;
    public          postgres    false    218   ?2       +          0    16668    eps 
   TABLE DATA           )   COPY public.eps (id, nombre) FROM stdin;
    public          postgres    false    214   ?5       &          0    16614    fecha_incapacidad 
   TABLE DATA           Y   COPY public.fecha_incapacidad (id, inicio, fin, numero_dias_incapacidad_mes) FROM stdin;
    public          postgres    false    209   H6       '          0    16633    fecha_vacaciones 
   TABLE DATA           S   COPY public.fecha_vacaciones (id, inicio, fin, numero_dias_vacaciones) FROM stdin;
    public          postgres    false    210   ?6       )          0    16653    novedad 
   TABLE DATA           Y   COPY public.novedad (id, fecha_ingreso, n_dias_trabajados_mes, c_no_trabajo) FROM stdin;
    public          postgres    false    212   57       ,          0    16673    pension 
   TABLE DATA           -   COPY public.pension (id, nombre) FROM stdin;
    public          postgres    false    215   ?7       ?           2606    16667    arl arl_pkey 
   CONSTRAINT     J   ALTER TABLE ONLY public.arl
    ADD CONSTRAINT arl_pkey PRIMARY KEY (id);
 6   ALTER TABLE ONLY public.arl DROP CONSTRAINT arl_pkey;
       public            postgres    false    213            ?           2606    16707    cargo cargo_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.cargo
    ADD CONSTRAINT cargo_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.cargo DROP CONSTRAINT cargo_pkey;
       public            postgres    false    217            ?           2606    16682    dependencia dependencia_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.dependencia
    ADD CONSTRAINT dependencia_pkey PRIMARY KEY (id);
 F   ALTER TABLE ONLY public.dependencia DROP CONSTRAINT dependencia_pkey;
       public            postgres    false    216            ?           2606    16642 *   dias_no_trabajados dias_no_trabajados_pkey 
   CONSTRAINT     h   ALTER TABLE ONLY public.dias_no_trabajados
    ADD CONSTRAINT dias_no_trabajados_pkey PRIMARY KEY (id);
 T   ALTER TABLE ONLY public.dias_no_trabajados DROP CONSTRAINT dias_no_trabajados_pkey;
       public            postgres    false    211            ?           2606    16843    empleado empleado_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.empleado
    ADD CONSTRAINT empleado_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.empleado DROP CONSTRAINT empleado_pkey;
       public            postgres    false    218            ?           2606    16672    eps eps_pkey 
   CONSTRAINT     J   ALTER TABLE ONLY public.eps
    ADD CONSTRAINT eps_pkey PRIMARY KEY (id);
 6   ALTER TABLE ONLY public.eps DROP CONSTRAINT eps_pkey;
       public            postgres    false    214            ?           2606    16618 (   fecha_incapacidad fecha_incapacidad_pkey 
   CONSTRAINT     f   ALTER TABLE ONLY public.fecha_incapacidad
    ADD CONSTRAINT fecha_incapacidad_pkey PRIMARY KEY (id);
 R   ALTER TABLE ONLY public.fecha_incapacidad DROP CONSTRAINT fecha_incapacidad_pkey;
       public            postgres    false    209            ?           2606    16637 &   fecha_vacaciones fecha_vacaciones_pkey 
   CONSTRAINT     d   ALTER TABLE ONLY public.fecha_vacaciones
    ADD CONSTRAINT fecha_vacaciones_pkey PRIMARY KEY (id);
 P   ALTER TABLE ONLY public.fecha_vacaciones DROP CONSTRAINT fecha_vacaciones_pkey;
       public            postgres    false    210            ?           2606    16657    novedad novedad_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.novedad
    ADD CONSTRAINT novedad_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.novedad DROP CONSTRAINT novedad_pkey;
       public            postgres    false    212            ?           2606    16677    pension pension_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.pension
    ADD CONSTRAINT pension_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.pension DROP CONSTRAINT pension_pkey;
       public            postgres    false    215            ?           2606    16708    cargo cargo_c_dependencia_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.cargo
    ADD CONSTRAINT cargo_c_dependencia_fkey FOREIGN KEY (c_dependencia) REFERENCES public.dependencia(id);
 H   ALTER TABLE ONLY public.cargo DROP CONSTRAINT cargo_c_dependencia_fkey;
       public          postgres    false    216    217    3214            ?           2606    16643 8   dias_no_trabajados dias_no_trabajados_c_incapacidad_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.dias_no_trabajados
    ADD CONSTRAINT dias_no_trabajados_c_incapacidad_fkey FOREIGN KEY (c_incapacidad) REFERENCES public.fecha_incapacidad(id);
 b   ALTER TABLE ONLY public.dias_no_trabajados DROP CONSTRAINT dias_no_trabajados_c_incapacidad_fkey;
       public          postgres    false    3200    209    211            ?           2606    16648 7   dias_no_trabajados dias_no_trabajados_c_vacaciones_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.dias_no_trabajados
    ADD CONSTRAINT dias_no_trabajados_c_vacaciones_fkey FOREIGN KEY (c_vacaciones) REFERENCES public.fecha_vacaciones(id);
 a   ALTER TABLE ONLY public.dias_no_trabajados DROP CONSTRAINT dias_no_trabajados_c_vacaciones_fkey;
       public          postgres    false    211    210    3202            ?           2606    16859    empleado empleado_c_arl_fkey    FK CONSTRAINT     w   ALTER TABLE ONLY public.empleado
    ADD CONSTRAINT empleado_c_arl_fkey FOREIGN KEY (c_arl) REFERENCES public.arl(id);
 F   ALTER TABLE ONLY public.empleado DROP CONSTRAINT empleado_c_arl_fkey;
       public          postgres    false    218    3208    213            ?           2606    16844 $   empleado empleado_c_dependencia_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.empleado
    ADD CONSTRAINT empleado_c_dependencia_fkey FOREIGN KEY (c_dependencia) REFERENCES public.dependencia(id);
 N   ALTER TABLE ONLY public.empleado DROP CONSTRAINT empleado_c_dependencia_fkey;
       public          postgres    false    3214    218    216            ?           2606    16854    empleado empleado_c_eps_fkey    FK CONSTRAINT     w   ALTER TABLE ONLY public.empleado
    ADD CONSTRAINT empleado_c_eps_fkey FOREIGN KEY (c_eps) REFERENCES public.eps(id);
 F   ALTER TABLE ONLY public.empleado DROP CONSTRAINT empleado_c_eps_fkey;
       public          postgres    false    3210    218    214            ?           2606    16849     empleado empleado_c_pension_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.empleado
    ADD CONSTRAINT empleado_c_pension_fkey FOREIGN KEY (c_pension) REFERENCES public.pension(id);
 J   ALTER TABLE ONLY public.empleado DROP CONSTRAINT empleado_c_pension_fkey;
       public          postgres    false    215    218    3212            ?           2606    16658 !   novedad novedad_c_no_trabajo_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.novedad
    ADD CONSTRAINT novedad_c_no_trabajo_fkey FOREIGN KEY (c_no_trabajo) REFERENCES public.dias_no_trabajados(id);
 K   ALTER TABLE ONLY public.novedad DROP CONSTRAINT novedad_c_no_trabajo_fkey;
       public          postgres    false    211    3204    212            *      x?3??/?,?,K?????? )<      .   ?   x?U?MN?0???)z??t?YU??f3b?&J?T??IF???gV? .?[!PV??????`_)2?4#5%?*?$అ????^J3??Q??-????ڿͅR?[????b?E8??t???|?E}????g4?u??If?LV?????[?2?bgCkK????R*?5??~iU9??7M˚lD?*{?hB????ڎ?[V?k??????;?y???Y?o?      -   G   x?3?IM????O??|hm"??[brIiQbr&P`s?1?s~^IbRfNfJb
?	???Z????????? 6?      (   ?   x?=?1
?@??1A?s??7N?6??o????A?X?cd֍???X???J?^D?w?j?A<??7Q?ۉ?sge|Ȃ+g6ZR?hI?%E}4??b?(U??t1ZRƸ?1w???I?}t???gD\?,G?      /     x?U?]n?8??;??? ?????82h?#Y?m?s?ًm??c/?$,TUM+??t^ǒ?$???I?u\DZ??r?dt?&Db?? ?A)r&IG????Y)?Ҝ~?Y\??eM???c?????J?$?A[C?U???tM?4?????eW??=?D???w/????t?2i?????u??>?S^?9?Ø?)Mc.	*???????y??#o<qvKǒ???O???t??!?<?G*?b3???9X?????G.??n?4??Đ?Rz:?y!m?dۥB??d?a+????y(]??Q?g??i?M?PK??b????L?T??F???t???????????5F?=???Ic׳?'?Ɔ?C????"???.i??F?rE??:???u?!?͕=0????2??P?{X?MgA?N??Ă????!O-Q??h??S??4???7????
?+f?Ы?Z?(??I???t?-AŁ4??Y???F
?{??|Os???`???8?1?!???x??s??{???g??l??o????\4??:?]??;v??o?@F9??#??z?ϱ?(?ǻ-?M?RE????}???3?W??z??h???&6M?G?;?멶??q??|?`Ƃ??v߶?v?Z?] ??#/?D??zA???˾z??{??r??i
n| 8?l?{b
???6?????R?L?d?w??|l+???????? ??	(?oѶn>?ׇͰ?6??VY??I??p?Ē>??^?q]??j?T??e??Ű??????o???m????????,	      +   :   x?3?t?N??,I,?2?t??L?+N?)MQ Jps????%??&??E?\1z\\\ 	?d      &   g   x?}?A? D?5?K?L??w???b0q??
/??'?8???@(?
ۼ???#kd??juWx(?
O??B??*U"6??U!?B???c<KNT??
??k3?F?bq      '   f   x?}???@D???f?]{??:?FILtn??? [ ࠿GX??+???E??pܛ?D???K7?Z???Q%??(???c4橪U#?FT?8?D??h??? ?b?      )   ?   x?E??!??Oq |zy?ױ1d??h???D?TT???*	?D?!V?'????9?a%l?-	????i??pn?3;???9?1}?2>M????r?A?J>??)Bu?7e'?7_צ,???`,,???n??.k??e/???????0??a??f????c??w.=?????g?????eVG?      ,   ?   x?3?t??)H?+???K-?2?(?/IMN?<?|hs?1?_???Y?e???????????? N?#     