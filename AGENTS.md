# AGENTS.md

## Objetivo do projeto

Este é um projeto didático. Seu objetivo principal é aprender Android Studio e os fundamentos do desenvolvimento Android nativo enquanto construímos uma calculadora de IMC.

Priorize entendimento, prática guiada e evolução incremental. Uma solução simples e explicável é melhor do que uma solução sofisticada que esconda como o Android funciona.

## Stack e requisitos atuais

- Aplicativo: `ImcApp`
- Pacote/namespace: `br.edu.fatecjahu.imcapp`
- Linguagem do aplicativo: Java
- Interface: Views com layouts XML (não Jetpack Compose)
- SDK mínimo: API 24 (Android 7.0 Nougat)
- Build: Gradle com Kotlin DSL (`.gradle.kts`)
- Módulo principal: `app`

Não confunda Kotlin DSL, usado nos arquivos de configuração do Gradle, com a linguagem do aplicativo, que deve continuar sendo Java.

## Como trabalhar neste repositório

1. Antes de alterar código, explique brevemente o conceito Android envolvido e quais arquivos serão afetados.
2. Faça mudanças pequenas, uma etapa de aprendizagem por vez.
3. Depois de cada mudança, explique o fluxo: entrada do usuário, evento, processamento e atualização da interface.
4. Mostre como executar e verificar a mudança no Android Studio ou com o Gradle Wrapper.
5. Ao encontrar um erro, ensine a ler a mensagem e a localizar a causa antes de aplicar a correção.
6. Preserve os requisitos do exercício, salvo solicitação explícita em contrário.
7. Prefira Java claro e layouts XML legíveis. Evite arquiteturas, bibliotecas e abstrações avançadas antes de serem necessárias.
8. Explique APIs novas na primeira vez em que forem usadas. Não presuma conhecimento prévio de Android.
9. Mantenha textos visíveis ao usuário em `res/values/strings.xml`.
10. Use nomes descritivos para IDs, variáveis, métodos e recursos.

## Organização que deve ser ensinada

- `app/src/main/java`: comportamento do aplicativo em Java.
- `app/src/main/res/layout`: estrutura visual das telas em XML.
- `app/src/main/res/values`: textos, cores e temas reutilizáveis.
- `app/src/main/AndroidManifest.xml`: componentes, permissões e ponto de entrada.
- `app/build.gradle.kts`: configuração do módulo, SDKs e dependências.
- `gradle/libs.versions.toml`: catálogo de versões das dependências.
- `app/src/test`: testes unitários locais.
- `app/src/androidTest`: testes executados em dispositivo ou emulador.

## Qualidade e verificação

- Não coloque textos fixos diretamente nos layouts ou no Java quando eles pertencerem a `strings.xml`.
- Valide entradas do usuário e trate campos vazios, valores inválidos e divisão por zero.
- Preserve acessibilidade básica: rótulos claros, contraste e áreas de toque adequadas.
- Execute testes relevantes e, quando possível, `gradlew.bat test` e `gradlew.bat lint`.
- Informe claramente o que foi verificado e qualquer limitação de emulador, SDK ou ambiente.

## Forma de ensinar

Ao concluir uma etapa, inclua:

- o que aprendemos;
- onde isso aparece no projeto;
- como testar no Android Studio;
- um pequeno próximo exercício para o estudante tentar.

Não implemente etapas futuras do aplicativo sem pedido. Ofereça pistas antes da resposta completa quando o estudante estiver praticando.
