<p align="center">Software para Padaria Delivery</p>

Contexto: A padaria Pão Doce deseja abrir uma startup que possibilita vender online e fazer
entrega dos pedidos a domicilio. Para isso, é necessário ter as seguintes funcionalidades:

1. A padaria possui um mecanismo que indica se existem novas entregas a serem
realizadas. Caso este status mude para “existem novas entregas” os entregadores e os
embaladores são notificados.
2. No sistema existe o cadastro de apenas uma única padaria.
3. Um cadastro de produtos a serem vendidos com sua respectiva quantidade e preço.
4. Um cadastro de clientes com os seguintes dados: bairro, latitude e longitude do cliente, e nome. Existem dois tipos de cliente, o tipo vip ou o normal. O cliente vip mora no bairro
do “Leblon”.
5. Um cadastro de entregas. Cada entrega pertence a um único cliente já cadastrado. Caso a entrega seja para um cliente vip, esta entrega terá um brinde associado. Existe uma ação “realizarEntrega” que entrega os produtos e no caso dos vips entrega também o brinde.
6. Funcionalidade de geração de rotas de entregas baseado na localização dos respectivos
clientes. A entrega deve ocorrer no menor percurso possível. Exemplo: O cliente faz um
pedido que pode ser adicionado manualmente pela empresa no sistema. Esse pedido é
realizado com produto, quantidade, latitude e longitude do cliente. Após adicionar alguns
pedidos exiba a lista em ordem de proximidade em relação a padaria. Para que seja
possível obter a proximidade é necessário que a padaria também tenha uma localização
definida, por exemplo: lat = 0, lon = 0;

<p align="center">Algumas correções</p>

1 - Organização das classes por arquivos
As classes estão organizadas em diretórios pela suas funcionalidades no sistema, as telas do software estão no diretório views, as classes que constituem a padaria estão em model e a classe principal por sua vez se encontra no diretório “principal”.

2 - Inserção de Blindagem nas classes
As classes presentes no diretório model estão blindadas caso ocorrer algum eventual erro no programa.

<p align="center">Refactory</p>

1 - Substituir Variável por Consulta (Replace Variable With Query): foi utilizado para remover algumas variáveis que poderiam utilizar métodos. 

2 - Criar um Método Padrão (Create a Default Method): em algumas classes foi criado um método padrão para ser utilizado com frequência.

3 - Preservar o Objeto Inteiro (Preserve Entire Object): para diminuir listas de parâmetros.

4 - Extrair Subclasse (Extract Subclass): para utilizar funcionalidades diferentes nas subclasses.

5 - Substituir Atributo por Objeto (Replace Attribute with Object): atributos representados por objetos.

6 - Remover Parâmetro (Remove Parameter): alguns métodos tinham parâmetros não utilizados.

7 - Encapsular Campo (Encapsulate Field): algumas classes tinham atributos públicos.

8 - Extrair Classe (Extract Class): extrair as classes pois no começo estava tudo em uma única classe.



