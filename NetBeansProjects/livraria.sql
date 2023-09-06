-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 21-Nov-2022 às 16:34
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `livraria`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cidade`
--

CREATE TABLE `cidade` (
  `ID` int(11) NOT NULL,
  `Nome` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `ID` int(11) NOT NULL,
  `Nome` varchar(100) NOT NULL,
  `CPF` varchar(20) NOT NULL,
  `Endereco` varchar(100) NOT NULL,
  `Cidade_FK` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `emprestimo`
--

CREATE TABLE `emprestimo` (
  `ID` int(11) NOT NULL,
  `NomeCliente_FK` int(11) NOT NULL,
  `NomeLivro_FK` int(11) NOT NULL,
  `Data` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `genero`
--

CREATE TABLE `genero` (
  `ID` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `livro`
--

CREATE TABLE `livro` (
  `ID` int(11) NOT NULL,
  `Nome` varchar(100) NOT NULL,
  `Genero_FK` int(11) NOT NULL,
  `Autor` varchar(50) NOT NULL,
  `Ano` int(11) NOT NULL,
  `Editora` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `cidade`
--
ALTER TABLE `cidade`
  ADD PRIMARY KEY (`ID`);

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `Cidade_FK` (`Cidade_FK`);

--
-- Índices para tabela `emprestimo`
--
ALTER TABLE `emprestimo`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `NomeCliente_FK` (`NomeCliente_FK`),
  ADD KEY `NomeLivro_FK` (`NomeLivro_FK`);

--
-- Índices para tabela `genero`
--
ALTER TABLE `genero`
  ADD PRIMARY KEY (`ID`);

--
-- Índices para tabela `livro`
--
ALTER TABLE `livro`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `Genero_FK` (`Genero_FK`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `cidade`
--
ALTER TABLE `cidade`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `emprestimo`
--
ALTER TABLE `emprestimo`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `genero`
--
ALTER TABLE `genero`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `livro`
--
ALTER TABLE `livro`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`Cidade_FK`) REFERENCES `cidade` (`ID`);

--
-- Limitadores para a tabela `emprestimo`
--
ALTER TABLE `emprestimo`
  ADD CONSTRAINT `emprestimo_ibfk_1` FOREIGN KEY (`NomeCliente_FK`) REFERENCES `cliente` (`ID`),
  ADD CONSTRAINT `emprestimo_ibfk_2` FOREIGN KEY (`NomeLivro_FK`) REFERENCES `livro` (`ID`);

--
-- Limitadores para a tabela `livro`
--
ALTER TABLE `livro`
  ADD CONSTRAINT `livro_ibfk_1` FOREIGN KEY (`Genero_FK`) REFERENCES `genero` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
