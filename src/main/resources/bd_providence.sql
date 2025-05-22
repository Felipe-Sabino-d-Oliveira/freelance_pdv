#CREATE DATABASE mercadinho_providence;
#USE mercadinho_providence;

CREATE TABLE funcionarios (id 			  int primary key,
						   nome 		  VARCHAR(50)  NOT NULL,
                           cpf 			  VARCHAR(11)  NOT NULL,
                           dataNascimento DATE 		   NOT NULL,
                           telefone 	  VARCHAR(11)  NOT NULL,
                           email 		  VARCHAR(50)  NOT NULL,
                           endereco		  VARCHAR(200) NOT NULL,
                           dataAdmissao   DATE 		   NOT NULL,
                           cargo 		  VARCHAR(20)  NOT NULL,
                           salario 		  DECIMAL(4,2) NOT NULL,
                           senha 		  VARCHAR(50)  NOT NULL,
                           ativo 		  BOOL 		   NOT NULL);

CREATE TABLE operadores (
    id_funcionario INT PRIMARY KEY,
    codigoCaixa INT,
    turno VARCHAR(20),
    ultimaVenda DATE,
    status VARCHAR(20),
    FOREIGN KEY (id_funcionario) REFERENCES funcionarios(id)
);

CREATE TABLE gerentes (
    id_funcionario INT PRIMARY KEY,
    -- (campos específicos do gerente, se houver),
    FOREIGN KEY (id_funcionario) REFERENCES funcionarios(id)
);

CREATE TABLE produtos (
    id                INT PRIMARY KEY,
    nome              VARCHAR(100)  NOT NULL,
    codigoBarras      VARCHAR(50)   NOT NULL UNIQUE,
    descricao         VARCHAR(200),
    unidade           VARCHAR(10)   NOT NULL,
    precoVenda        DECIMAL(10,2) NOT NULL,
    precoCusto        DECIMAL(10,2) NOT NULL,
    quantidadeEstoque INT           NOT NULL,
    validade		  DATE			NOT NULL,
    ativo             BOOL          NOT NULL
);

CREATE TABLE pagamentos (
    id         INT PRIMARY KEY,
    forma      VARCHAR(20) NOT NULL, -- Ex: "Dinheiro", "PIX"
    valorPago  DECIMAL(10,2) NOT NULL,
    troco      DECIMAL(10,2) NOT NULL
);

CREATE TABLE pedidos (
    id         INT PRIMARY KEY,
    dataHora   DATETIME NOT NULL,
    operadorId INT      NOT NULL,
    pagamentoId INT     NOT NULL,
    total      DECIMAL(10,2) NOT NULL,
    status     VARCHAR(20)   NOT NULL,

    FOREIGN KEY (operadorId) REFERENCES funcionarios(id),
    FOREIGN KEY (pagamentoId) REFERENCES pagamentos(id)
);

CREATE TABLE itens_pedido (
    id         	  INT PRIMARY KEY,
    pedidoId   	  INT NOT NULL,
    produtoId  	  INT NOT NULL,
    quantidade	  INT NOT NULL,
    precoUnitario DECIMAL(10,2) NOT NULL,
    subtotal   	  DECIMAL(10,2) NOT NULL,

    FOREIGN KEY (pedidoId) REFERENCES pedidos(id),
    FOREIGN KEY (produtoId) REFERENCES produtos(id)
);

CREATE TABLE estoque (
    id INT PRIMARY KEY AUTO_INCREMENT,
    localizacao VARCHAR(100) NOT NULL,
    dataAtualizacao DATE NOT NULL
);

CREATE TABLE estoques (
    id INT PRIMARY KEY,
    localizacao VARCHAR(100) NOT NULL
);

CREATE TABLE estoque_produto (
    id INT PRIMARY KEY AUTO_INCREMENT,
    estoque_id INT NOT NULL,
    produto_id INT NOT NULL,
    quantidade INT NOT NULL,
    FOREIGN KEY (estoque_id) REFERENCES estoque(id),
    FOREIGN KEY (produto_id) REFERENCES produtos(id)
);

INSERT INTO funcionarios 
(id, nome, cpf, dataNascimento, telefone, email, endereco, dataAdmissao, cargo, salario, senha, ativo)
VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

INSERT INTO produtos 
(id, nome, codigoBarras, descricao, unidade, precoVenda, precoCusto, quantidadeEstoque, validade, ativo)
VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

INSERT INTO pagamentos 
(id, forma, valorPago, troco)
VALUES (?, ?, ?, ?);

INSERT INTO pedidos 
(id, dataHora, operadorId, pagamentoId, total, status)
VALUES (?, ?, ?, ?, ?, ?);

INSERT INTO itens_pedido 
(id, pedidoId, produtoId, quantidade, precoUnitario, subtotal)
VALUES (?, ?, ?, ?, ?, ?);