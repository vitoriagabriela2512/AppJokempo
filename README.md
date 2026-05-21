📱 Descrição do Projeto

O App Jokenpo é um aplicativo Android desenvolvido em Java no Android Studio que simula o clássico jogo Pedra, Papel e Tesoura.

O jogador escolhe uma opção entre:

✊ Pedra
📄 Papel
✂️ Tesoura

O aplicativo faz uma escolha aleatória automaticamente e exibe:

A imagem escolhida pelo aplicativo
O resultado da rodada
O placar atualizado

O projeto também possui um botão para reiniciar o jogo e zerar o placar.

🚀 Funcionalidades

✅ Escolha entre Pedra, Papel ou Tesoura

✅ Escolha aleatória do aplicativo

✅ Exibição da imagem da jogada do App

✅ Sistema de vitória, derrota e empate

✅ Placar automático

✅ Botão de reiniciar jogo

✅ Interface simples e interativa

🧠 Regras do Jogo
Pedra vence Tesoura
Tesoura vence Papel
Papel vence Pedra
🎮 Funcionamento do Aplicativo

O jogador seleciona uma das opções disponíveis.

O aplicativo:

Gera uma escolha aleatória
Mostra a imagem correspondente
Compara as escolhas
Exibe o resultado
Atualiza o placar
🧮 Lógica Utilizada
Escolha Aleatória
String opcoes[] = {"pedra", "papel", "tesoura"};

String opcaoApp = opcoes[new Random().nextInt(3)];
🏆 Verificação de Resultado
Jogador perdeu
if (
(opcaoApp.equals("tesoura") && opcaoSelecionada.equals("papel")) ||
(opcaoApp.equals("papel") && opcaoSelecionada.equals("pedra")) ||
(opcaoApp.equals("pedra") && opcaoSelecionada.equals("tesoura"))
)
Jogador ganhou
else if (
(opcaoSelecionada.equals("tesoura") && opcaoApp.equals("papel")) ||
(opcaoSelecionada.equals("papel") && opcaoApp.equals("pedra")) ||
(opcaoSelecionada.equals("pedra") && opcaoApp.equals("tesoura"))
)
📊 Sistema de Placar

O aplicativo possui um contador de pontos:

int pontuacaoJogador = 0;
int pontuacaoApp = 0;

Sempre que uma rodada termina:

O vencedor recebe +1 ponto
O placar é atualizado automaticamente
🔄 Reiniciar Jogo

O botão Reiniciar:

✅ Zera o placar

✅ Limpa o resultado anterior

✅ Volta a imagem padrão

public void reiniciarJogo(View view) {

    pontuacaoJogador = 0;
    pontuacaoApp = 0;

    atualizarPlacar();

    txtResultado.setText("Escolha uma opção");

    imgApp.setImageResource(R.drawable.padrao);
}
🖼️ Imagens Utilizadas

As imagens devem ser adicionadas na pasta:

res/drawable

Imagens necessárias:

padrao.png
pedra.png
papel.png
tesoura.png
🖥️ Interface do Aplicativo
Componentes utilizados
TextView
ImageView
Button
📂 Estrutura do Projeto
AppJokenpo/

│

├── app/

│   ├── java/br/ulbra/appjokempo/

│   │   └── MainActivity.java

│   │

│   ├── res/

│   │   ├── drawable/

│   │   │   ├── pedra.png

│   │   │   ├── papel.png

│   │   │   ├── tesoura.png

│   │   │   └── padrao.png

│   │   │

│   │   └── layout/

│   │       └── activity_main.xml

│

├── AndroidManifest.xml

│

└── README.md
🛠️ Tecnologias Utilizadas
Java
XML
Android Studio
Material Design
Android SDK
✅ Requisitos Funcionais

✔ Escolher Pedra, Papel ou Tesoura

✔ Gerar escolha automática do App

✔ Mostrar resultado da rodada

✔ Atualizar placar

✔ Reiniciar jogo

✔ Exibir imagens das jogadas

⚙️ Requisitos Não Funcionais

✔ Interface amigável

✔ Layout responsivo

✔ Código organizado

✔ Fácil utilização

✔ Compatível com Android 7.0+

▶️ Como Executar o Projeto
Requisitos
Android Studio
Java JDK
Emulador Android ou celular físico
Passos
Abra o Android Studio
Clique em:
Open Project
Selecione a pasta do projeto
Aguarde o Gradle sincronizar
Execute o aplicativo
👨‍💻 Autor

Desenvolvido por Vitória Gabriela Fernandes da Luz
