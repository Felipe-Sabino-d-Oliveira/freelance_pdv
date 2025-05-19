-- Criando o banco de dados
CREATE DATABASE mercadinho_providence
-- Entrando no banco de dados
USE mercadinho_providence;
-- Criando a tabela funcionarios
CREATE TABLE funcionarios (
    id INT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    cpf VARCHAR(11) NOT NULL,
    dataNascimento DATE NOT NULL,
    endereco VARCHAR NOT NULL,
    dataAdmissao DATE NOT NULL,
    cargo VARCHAR(20) NOT NULL,
    salario DECIMAL(4,2) NOT NULL, 
    senha VARCHAR(50) NOT NULL,
    ativo BOOL NOT NULL
);

-- Criando a tabela operadores
CREATE TABLE operadores (
    id INT PRIMARY KEY,
    codigoCaixa INT,
    turno VARCHAR(20),
    ultimaVenda DATE,
    status VARCHAR(20),
    FOREIGN KEY(id_funcionario) REFERENCES funcionarios(id)
);

-- Criando a tabela gerente
CREATE TABLE gerentes (
    id_funcionario INT PRIMARY KEY,
    FOREIGN KEY
)