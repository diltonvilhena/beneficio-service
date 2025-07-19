CREATE TABLE beneficios (
    id SERIAL PRIMARY KEY,
    nome_beneficio VARCHAR(100) NOT NULL,
    cpf_beneficiario VARCHAR(11) NOT NULL,
    valor NUMERIC(10, 2) NOT NULL,
    data_concessao DATE NOT NULL,
    origem VARCHAR(100) NOT NULL
);