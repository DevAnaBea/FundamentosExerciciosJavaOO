package com.fundamentos.javaoo.exercicios.questao12;

public class Main {
    public static void main(String[] args) {

        Quadrado f1 = new Quadrado();
        f1.setLado(2);
        f1.setNome("Quadrado");

        Circulo f2 = new Circulo();
        f2.setRaio(2);
        f2.setNome("Circulo");

        Triangulo f3 = new Triangulo();
        f3.setAltura(2);
        f3.setBase(3);
        f3.setNome("Triangulo");

        Cubo f4 = new Cubo();
        f4.setAresta(3);
        f4.setNome("Cubo");

        Cilindro f5 = new Cilindro();
        f5.setAltura(3);
        f5.setRaio(2);
        f5.setNome("Cilindro");

        Piramide f6 = new Piramide();
        f6.setAltura(3);
        f6.setApotema(4);
        f6.setArestaBase(2);
        f6.setNumeroPoligonoBase(4);
        f6.setBase(f1);
        f6.setNome("Piramide");

        System.out.println("Entradas:");
        System.out.println("---------------------------");

        System.out.printf("%s -> lado: %s%n", f1.getNome(), f1.getLado());

        System.out.printf("%s -> raio: %s%n", f2.getNome(), f2.getRaio());

        System.out.printf("%s -> altura: %s | base: %s%n", f3.getNome(), f3.getAltura(), f3.getBase());

        System.out.printf("%s -> aresta: %s%n", f4.getNome(), f4.getAresta());

        System.out.printf("%s -> altura: %s | raio: %s%n", f5.getNome(), f5.getAltura(), f5.getRaio());

        System.out.printf("%s -> altura: %s | base: %s | apotema: %s | aresta base: %s | numero poligono base: %d%n",
                f6.getNome(), f6.getAltura(), f6.getBase().calcularArea(), f6.getApotema(), f6.getArestaBase(),
                f6.getNumeroPoligonoBase());

        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = f1;
        figuras[1] = f2;
        figuras[2] = f3;
        figuras[3] = f4;
        figuras[4] = f5;
        figuras[5] = f6;

        for (FiguraGeometrica figura : figuras){
            System.out.println("==========================");
            System.out.println(figura.getNome());

            if (figura instanceof Figura2D){
                Figura2D f2d = (Figura2D) figura;
                System.out.println("Area: " + f2d.calcularArea());
            }

            if (figura instanceof Figura3D){
                Figura3D f3d = (Figura3D) figura;
                System.out.println("Area: " + f3d.calcularArea());
                System.out.println("Volume: " + f3d.calcularVolume());
            }

        }

    }
}