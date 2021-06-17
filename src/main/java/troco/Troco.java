package troco;

import java.util.ArrayList;

public class Troco {

    private double notaCem;
    private double notaCinquenta;
    private double notaVinte;
    private double notaDez;
    private double notaCinco;
    private double notaDois;
    private double moedaUm;
    private double moedaCinquenta;
    private double moedaVinteCinco;
    private double moedaDez;
    private double moedaCinco;
    private double moedaUmCentavo;

    private double trocoFormula;

    private ArrayList<Double> quantidadeNotas = new ArrayList<>();

    public ArrayList<Double> calculaNotas(double troco) {

        if (troco >= 100.00) {
            trocoFormula = troco;
            troco = troco % 100.00;
            this.notaCem = ((trocoFormula - troco) / 100);
            this.quantidadeNotas.add(this.notaCem);
        } else {
            this.quantidadeNotas.add(0d);
        }

        if (troco >= 50.00) {
            trocoFormula = troco;
            troco = troco % 50.00;
            this.notaCinquenta = ((trocoFormula - troco) / 50);
            this.quantidadeNotas.add(this.notaCinquenta);
        } else {
            this.quantidadeNotas.add(0d);
        }

        if (troco >= 20.00) {
            trocoFormula = troco;
            troco = troco % 20.00;
            this.notaVinte = ((trocoFormula - troco) / 20);
            this.quantidadeNotas.add(this.notaVinte);
        } else {
            this.quantidadeNotas.add(0d);
        }

        if (troco >= 10.00) {
            trocoFormula = troco;
            troco = troco % 10.00;
            this.notaDez = ((trocoFormula - troco) / 10);
            this.quantidadeNotas.add(this.notaDez);
        } else {
            this.quantidadeNotas.add(0d);
        }

        if (troco >= 5.00) {
            trocoFormula = troco;
            troco = troco % 5.00;
            this.notaCinco = ((trocoFormula - troco) / 5);
            this.quantidadeNotas.add(this.notaCinco);
        } else {
            this.quantidadeNotas.add(0d);
        }

        if (troco >= 2.00) {
            trocoFormula = troco;
            troco = troco % 2.00;
            this.notaDois = ((trocoFormula - troco) / 2);
            this.quantidadeNotas.add(this.notaDois);
        } else {
            this.quantidadeNotas.add(0d);
        }

        if (troco >= 1.00) {
            trocoFormula = troco;
            troco = troco % 1.00;
            this.moedaUm = trocoFormula - troco;
            this.quantidadeNotas.add(this.moedaUm);
        } else {
            this.quantidadeNotas.add(0d);
        }

        if (troco >= 0.50) {
            trocoFormula = troco;
            troco = troco % 0.50;
            this.moedaCinquenta = ((trocoFormula - troco) / 0.50);
            this.quantidadeNotas.add(this.moedaCinquenta);
        } else {
            this.quantidadeNotas.add(0d);
        }

        if (troco >= 0.25) {
            trocoFormula = troco;
            troco = troco % 0.25;
            this.moedaVinteCinco = ((trocoFormula - troco) / 0.25);
            this.quantidadeNotas.add(this.moedaVinteCinco);
        } else {
            this.quantidadeNotas.add(0d);
        }

        if (troco >= 0.10) {
            trocoFormula = troco;
            troco = troco % 0.10;
            this.moedaDez = ((trocoFormula - troco) / 0.10);
            this.quantidadeNotas.add(this.moedaDez);
        } else {
            this.quantidadeNotas.add(0d);
        }

        if (troco >= 0.05) {
            trocoFormula = troco;
            troco = troco % 0.05;
            this.moedaCinco = ((trocoFormula - troco) / 0.05);
            this.quantidadeNotas.add(this.moedaCinco);
        } else {
            this.quantidadeNotas.add(0d);
        }

        if (troco >= 0.01) {
            trocoFormula = troco;
            troco = troco % 0.01;
            this.moedaUmCentavo = ((trocoFormula - troco) / 0.01);
            this.quantidadeNotas.add(this.moedaUmCentavo);
        } else {
            this.quantidadeNotas.add(0d);
        }

        return this.quantidadeNotas;
    }

    public void mostrarNotas() {
        System.out.println("NOTAS");
        if (notaCem > 0) {
            System.out.println((int)notaCem+ " Nota(s) de R$100,00 ");
        }
        if (notaCinquenta > 0) {
            System.out.println((int)notaCinquenta + " Nota(s) de R$50,00 ");
        }
        if (notaVinte > 0) {
            System.out.println((int)notaVinte + " Nota(s) de R$20,00 ");
        }
        if (notaDez > 0) {
            System.out.println((int)notaDez + " Nota(s) de R$10,00 ");
        }
        if (notaCinco > 0) {
            System.out.println((int)notaCinco + " Nota(s) de R$5,00 ");
        }
        if (notaDois > 0) {
            System.out.println((int)notaDois + " Nota(s) de R$2,00 ");
        }
        System.out.println("MOEDAS");
        if (moedaUm > 0) {
            System.out.println((int)moedaUm + " Moeda(s) de R$1,00 ");
        }
        if (moedaCinquenta > 0) {
            System.out.println((int)moedaCinquenta + " Moeda(s) de R$0,50 ");
        }
        if (moedaVinteCinco > 0) {
            System.out.println((int)moedaVinteCinco + " Moeda(s) de R$0,25 ");
        }
        if (moedaDez > 0) {
            System.out.println((int)moedaDez + " Moeda(s) de R$0,10 ");
        }
        if (moedaCinco > 0) {
            System.out.println((int)moedaCinco + " Moeda(s) de R$0,05 ");
        }
        if (moedaUmCentavo > 0) {
            System.out.println((int)moedaUmCentavo + " Moeda(s) de R$0,01 ");
        }
    }
}




