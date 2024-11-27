
package av1proo;
import java.util.ArrayList;
import java.util.Scanner;

import classes.Veiculo;
import subclasses.Carro;
import subclasses.Moto;

/*


armazenar diferentes tipos de veículos, calcular o valor do seguro de cada um e 
garantir que eles passem por manutenções periódicas.
 

A empresa possui uma frota variada, composta por carros e motos, e cada tipo de 
veículo possui suas particularidades no cálculo do seguro e na realização de manutenções. 
A empresa também deseja armazenar todos os veículos em uma lista para fácil consulta.

 

Requisitos:

1.     Crie uma classe abstrata chamada Veiculo com os atributos placa (String) e ano (int). A classe deve ter:

o   Um construtor para inicializar os atributos.

o   Um método abstrato chamado calcularValorSeguro(), que será implementado pelas subclasses.

o   Um método concreto chamado exibirDetalhes(), que exibe a placa e o ano do veículo.



2.     Crie uma interface chamada Manutencao que define:

o   Um método chamado realizarManutencao() que retorna uma string indicando que a manutenção foi realizada.



3.     Crie as seguintes subclasses de Veiculo:

o   Carro: com o atributo adicional numeroPortas (int) e implementando o
 método calcularValorSeguro(), 
considerando o número de portas para definir o valor do seguro.

o   Moto: com o atributo adicional cilindrada (int) e 
implementando o método calcularValorSeguro(), 
considerando a cilindrada para definir o valor do seguro.



 Ambas as classes devem implementar a interface Manutencao, 
 indicando como a manutenção é realizada para cada tipo de veículo.



4.     Crie uma estrutura de dados do tipo ArrayList para armazenar diversos veículos.



5.     Implemente uma classe principal GerenciadorVeiculos que:

o   Cria uma lista de veículos (ArrayList).

o   Adiciona instâncias de Carro e Moto à lista.

o   Percorre a lista exibindo os detalhes de cada veículo, calculando o valor do seguro e realizando a manutenção.

 

Implemente o código necessário para atender os requisitos acima (utilizando Java) e crie uma solução que permita o gerenciamento adequado da frota de veículos da empresa, levando em consideração a particularidade de cada tipo de veículo.

*/
public class GerenciadorVeiculos {
    
    
    public static void main (String [] args){
    	
        Scanner sc = new Scanner(System.in);    
        System.out.println("teste de caso");
        
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

        
        Moto m = new Moto();
        System.out.println("Insira o ano da moto");
        int ano = sc.nextInt();
        m.setAno(ano);
        
        System.out.println("Insira a placa da moto");
        String placa = sc.next();
        m.setPlaca(placa);
        

        System.out.println("Insira o cilindradas da moto");
        int cilindrada = sc.nextInt();
        m.setCilindrada(cilindrada);
        
        m.calcularValorSeguro();
        
        
        listaVeiculos.add(m);
        
        Moto m1 = new Moto();
        m1.setAno(2024);
        m1.setPlaca("M4AS5");
        m1.setCilindrada(150);
        m1.realizarManutencao();
        
        listaVeiculos.add(m1);
        
        Carro c1 = new Carro();
        c1.setAno(2024);
        c1.setPlaca("M4AS5");
        c1.setNumeroPortas(4);
        listaVeiculos.add(c1);
        
        Carro c2 = new Carro();
        System.out.println("Insira o ano do carro");
        int anoC = sc.nextInt();
        c2.setAno(anoC);
        
        System.out.println("Insira a placa do carro");
        String placaC = sc.next();
        c2.setPlaca(placaC);
        

        System.out.println("Insira a quantidade de portas do carro");
        int numPortas = sc.nextInt();
        c2.setNumeroPortas(numPortas);
        
        listaVeiculos.add(c2);
        
        //listaVeiculos.add()
        
        for (Veiculo veiculo: listaVeiculos) {
        	veiculo.exibirDetalhes();
        	if (veiculo instanceof Moto) {
                Moto moto = (Moto) veiculo;
                System.out.println("Valor do Seguro da Moto: R$ "+ moto.calcularValorSeguro());
                System.out.println(moto.realizarManutencao());
                System.out.println("----------------------------------------------------");
            } else if (veiculo instanceof Carro) {
                Carro carro = (Carro) veiculo;
                System.out.println("Valor do Seguro do Carro: R$ " + carro.calcularValorSeguro());
                System.out.println(carro.realizarManutencao());
                System.out.println("----------------------------------------------------");
            }
        	//calcularValorSeguro();
        	
        }
        
        //Carro c = new Carro();
        
    }
    
}
