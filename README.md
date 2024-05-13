## <p align="center">Jantar dos Filosofos( java )</p>

O problema do "Jantar dos Filósofos" é um clássico problema de sincronização em computação. Ele ilustra uma situação em que múltiplos processos (os filósofos) competem por recursos compartilhados (os garfos) de uma forma que pode levar a um impasse (deadlock) se não for tratado corretamente.
## 💻 tecnologias

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![Visual Studio Code](https://img.shields.io/badge/Visual%20Studio%20Code-0078d7.svg?style=for-the-badge&logo=visual-studio-code&logoColor=white)


<img src="https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjtx0xMPABcnDt8O1TQG4nhDONe7rypA-11Ckdfm4wI6HzXUKbafRRkSTaK6ECyyNQAg69hmPU5rUQNC0babmtAnPdVlwb9d6b9-u5E9qBoJF_3OfZxrZ-aFKRz5bP82eOJq2UrOpssG9dC/s800/jantar-filosofos.jpg" height="200" widht="300" alt="img-jantar-filosofos"/>

## Descrição do Problema

Imagine que cinco filósofos estão sentados em torno de uma mesa redonda. Entre cada par de filósofos, há um garfo. Para comer, um filósofo precisa dos dois garfos adjacentes à sua cadeira. No entanto, cada garfo só pode ser usado por um filósofo de cada vez. Portanto, o problema surge quando todos os filósofos pegam o garfo à sua esquerda ao mesmo tempo. Nesse caso, nenhum filósofo pode pegar o garfo à sua direita e todos ficam em espera eterna.

## Solução

Uma solução para este problema é usar semáforos para controlar o acesso aos garfos, garantindo que os filósofos peguem os garfos de forma coordenada e evitem impasses.

## Implementação em Java

Este repositório contém uma implementação simples do problema do Jantar dos Filósofos em Java. Aqui está como funciona:

- Cada filósofo é representado por uma thread.
- Os garfos são representados por semáforos.
- Cada filósofo alterna entre pensar, pegar garfos, comer e largar garfos.
- Os semáforos são usados para garantir que os filósofos peguem os garfos de forma coordenada.

## Como Executar

Para executar o código, basta compilar os arquivos `.java` e executar o arquivo `.class` da classe principal `JantarDosFilosofos`.

## Referências

- [**pantuza** - O JANTAR DOS FILÓSOFOS - PROBLEMA DE SINCRONIZAÇÃO EM SISTEMAS OPERACIONAIS](https://blog.pantuza.com/artigos/o-jantar-dos-filosofos-problema-de-sincronizacao-em-sistemas-operacionais)

- [**Deviante** - jantar dos filosofos](https://www.deviante.com.br/noticias/entre-forks-e-segredos/#:~:text=Starvation,evento%20também%20conhecido%20como%20Starvation.)

## 🧑‍💻 Autor

Este exemplo foi desenvolvido por <br>
<table>
  <tr>
     <td align="center">
       <a href="https://github.com/Otto-Samuel">
         <img src="https://avatars.githubusercontent.com/u/162514493?v=4" style="border-radius: 50%" width="100px;" alt="Otto Samuel"/>
         <br />
         <sub><b>Otto Samuel</b></sub>
       </a>
     </td>
  </tr>
</table>

