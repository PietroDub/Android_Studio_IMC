# IMC Android Studio Java

Projeto didático de uma calculadora de índice de massa corporal para aprender os fundamentos do Android Studio e do desenvolvimento Android nativo.

## Tecnologias

- Java
- Views e layouts XML
- Material Components
- Gradle com Kotlin DSL
- SDK mínimo: API 24 (Android 7.0)

## Como executar

1. Abra esta pasta no Android Studio.
2. Aguarde a sincronização do Gradle.
3. Escolha um emulador ou dispositivo Android.
4. Pressione **Run**.

## Etapas de aprendizagem

O histórico Git foi construído para permitir o estudo incremental:

1. Criação dos campos de peso e altura.
2. Leitura dos valores digitados.
3. Validação de campos obrigatórios.
4. Cálculo do IMC.
5. Classificação do resultado.
6. Melhoria visual e de acessibilidade.

No Android Studio, abra a janela **Git > Log** para visualizar cada commit e comparar as mudanças.

## Fluxo principal

O layout XML recebe peso e altura. A `MainActivity` lê e valida os campos quando o botão é pressionado, calcula `peso / (altura × altura)` e atualiza o texto de resultado.
