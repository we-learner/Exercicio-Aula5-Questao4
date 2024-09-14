package com.mycompany.questao_4;

public class ImpostoDeRenda
{
    private double salario;

    public ImpostoDeRenda(double salario)
    {
        this.salario = salario;
    }

    public double calcularImposto()
    {
        double imposto = 0.0;

        if (salario <= 2259.20)
        {
            imposto = 0.0;
        }
        else if (salario <= 2826.65)
        {
            imposto = (salario - 2259.20) * 0.075 - 169.44;
        }
        else if (salario <= 3751.05)
        {
            imposto = (salario - 2826.65) * 0.15 - 381.44;
        }
        else if (salario <= 4664.68)
        {
            imposto = (salario - 3751.05) * 0.225 - 662.77;
        }
        else
        {
            imposto = (salario - 4664.68) * 0.275 - 896.00;
        }

        return imposto;
    }

    public double getSalario()
    {
        return salario;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    public static void main(String[] args)
    {
        ImpostoDeRenda ir = new ImpostoDeRenda(5000.00);
        System.out.println("O imposto de renda eh: R$ " + ir.calcularImposto());
    }
}