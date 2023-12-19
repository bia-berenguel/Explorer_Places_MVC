use `banco_de_dados_explorer_places`;

INSERT INTO cliente (id, email, nome, telefone, senha, confirmasenha)
VALUES 
(default, 'ana@email.com', 'ana', '99 99999-0000', '1234', '1234'),
(default, 'joao@email.com', 'joao', '99 99999-0000', '1234', '1234'),
(default, 'luis@email.com', 'luis', '99 99999-0000', '1234', '1234'),
(default, 'maria@email.com', 'maria', '99 99999-0000', '1234', '1234');
select * from cliente;

INSERT INTO destino (id, cidade, estado, descricao)
VALUES 
(default, 'Salvador', 'BA', 'descricao'),
(default, 'São Paulo', 'SP', 'descricao'),
(default, 'Recife', 'PE', 'descricao'),
(default, 'Rio de Janeiro', 'RJ', 'descricao');

select * from destino; 