# Projeto-POO

Vou fazer o projeto sozinho.
Uanderson Henrique Batista da Silva - 21110435

Decidi que vou fazer o projeto de 2 maneiras um com interface e base de dados outro sem interface, pois nunca mexi com interface e banco de dados e não garanto que vai ter os 4 patterns, mas no sem interface vou conseguir colocar os 4 patterns, mas tambem estou gostando de mexer com interface, ai vou continuar e irei colocar os 2 no github.

Planejo fazer um cadastro de um hospital, tera o cadastro de informações de contato e informações mais da área medica dos pacientes, tambem a criação de um prontuario para adicionar informações de em qual enfermaria estara o paciente, quais remedios ele vai/esta tomando no hospital, e poder fazer/ver anotações sobre o andamento do paciente.

# Tela de login
O usuário vai realizar logins com nome de usuário e senha.

Os logins vão ter diferentes tipos de permissão.
*	Recepção – tela de cadastro podendo realizar, editar e visualizar o cadastro. E também pode solicitar materiais do tipo papelaria.

*	Enfermaria – so vai poder visualizar o cadastro, mas vai poder realizar, modificar e visualizar o prontuário. E também pode solicitar materiais do tipo farmácia.

*	Almoxarifado- Vai poder visualizar os pedidos de matérias do tipo papelaria.

*	Farmácia- Vai poder visualizar os pedidos de matérias do tipo farmácia.

*	TI – Vai poder realizar, modificar e visualizar o cadastro como também o prontuário, vai poder solicitar matérias do tipo papelaria.  Vai poder criar novas contar e modificar contas existentes.

#  Tela de cadastro
Na tela de cadastro você vai poder visualizar quem já tem cadastro, podendo ser editado, e quando foi a última vez que utilizou o hospital, e também vai poder cadastrar novas pessoas.
A tela de cadastro vai solicitar:
* Nome completo
*	Data de nascimento
*	CEP
*	Rua
*	Bairro
*	Numero
*	Complemento
*	Cidade
*	Estado
*	Telefone para contato
*	Telefone para contato de algum parente/amigo
*	Sexo
*	Cor
*	Situação civil
*	CPF
*	RG
*	Escolaridade
*	Cartão sus.


# Tela do Prontuário
Na tela de prontuário você vai poder visualizar quem já tem um prontuário, podendo ser editado.
Nessa tela também vai poder informar informações fixas mais sobre a área medica como:
*	Altura
*	Tipo sanguíneo
*	Alergias
*	Se toma algum remédio, se sim qual.
*	Se tem câncer ou alguém da família tem.
*	Se tem hipertensão ou alguém da família tem.
*	Se tem diabete ou alguém da família tem.
*	Se tem doença cardíaca ou alguém da família tem.
*	Se tem alguma doença crônica.
*	Se já fez cirurgia.

Em outra aba será onde vai ser colocado informações não fixas em forma de comentario, diárias do paciente.

Por exemplo:

Dia 11/11/2022
Peso 84 kg
Pressão 16 por 10.
Paciente relata está com dor no corpo de tosse e está com pressão alta.
Foi receitado remédio tal para a dor e tosse, e remédio tal para pressão alta.
Paciente se alimentou normalmente e está dormindo.

Dia 12/11/2022
Pressão 12 por 8
Paciente já está com a pressão normal, e não está mais com dor.
Foi receitado um remédio para tosse, e foi lhe dado alta.




# Tela de solicitação de materiais
Nessa tela poderá ser solicitado os matérias que o usuário tem permissão de pedir, nele você vai informar:
*	Area do material (Almoxarifado / Farmácia)
*	Material
*	Quantidade
*	Entregar ou você vai pegar?

Automaticamente no pedido vai ter o nome de quem solicitou e o setor que ele trabalha.

#Tela da visualização de solicitação de materiais

Nessa tela vai ser visualizado os pedidos e as informações que contem nele, podendo ser marcado quando ter entregado o pedido.
O usuário so vai poder ver os pedidos relacionados a sua área (Almoxarifado / Farmácia).

# Tela da criação de contas
O usuário vai poder realizar a criação de contas e dar as permissões para as telas do seu setor, também vai poder editar contas que já existem.

