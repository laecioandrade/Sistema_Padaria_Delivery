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
