# Comando para criar uma aplicação React pré configurada.

comando: npx create-react-app "nome do projeto"

npm -v => Verifica a versão do npm

# fazendo update do npm

modo 1: npm update -g
modo 2: npm install npm@latest -g

# Estado e Ciclo de Vida

- Inicialização
- Montagem
- Atualização
- Desmontagem

# Instalação do Webpack

npm install -D webpack webpack-cli

# Instalação do Babel

npm i @babel/core babel-loader @babel/preset-env @babel/preset-react --save-dev

# Instalação ESLint

npm instal --save-dev eslint babel-eslint eslint-plugin-react eslint-watch

# Instalação do react-redux e react-devtools

npm install react-redux
npm install --save-dev redux-devtools

# Instalação TDD para teste de componente

npm add --dev @testing-library/react

# para extensores de comparação no jest

npm add --dev @testing-library/jest-dom/extend-expect
