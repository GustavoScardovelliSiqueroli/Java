-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 10-Abr-2023 às 12:15
-- Versão do servidor: 10.4.18-MariaDB
-- versão do PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bancoappmain`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `analise`
--

CREATE TABLE `analise` (
  `id` int(11) NOT NULL,
  `atexto` varchar(2500) NOT NULL,
  `anota` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `autor`
--

CREATE TABLE `autor` (
  `id` int(11) NOT NULL,
  `nome` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `editora`
--

CREATE TABLE `editora` (
  `id` int(11) NOT NULL,
  `nome` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `filme`
--

CREATE TABLE `filme` (
  `id` int(50) NOT NULL,
  `titulo` varchar(250) DEFAULT NULL,
  `sinopse` varchar(2500) DEFAULT NULL,
  `ano` year(4) DEFAULT NULL,
  `duracao` decimal(50,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `filme_autor`
--

CREATE TABLE `filme_autor` (
  `id` int(11) NOT NULL,
  `idAutor` int(11) NOT NULL,
  `idFilme` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `filme_genero`
--

CREATE TABLE `filme_genero` (
  `id` int(11) NOT NULL,
  `idFilme` int(11) NOT NULL,
  `idGenero` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `genero`
--

CREATE TABLE `genero` (
  `id` int(11) NOT NULL,
  `nome` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `item`
--

CREATE TABLE `item` (
  `id` int(11) NOT NULL,
  `nome` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `livro`
--

CREATE TABLE `livro` (
  `id` int(50) NOT NULL,
  `titulo` varchar(250) DEFAULT NULL,
  `sinopse` varchar(2500) DEFAULT NULL,
  `ano` year(4) DEFAULT NULL,
  `npagina` int(5) DEFAULT NULL,
  `itemId` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `livro_autor`
--

CREATE TABLE `livro_autor` (
  `id` int(11) NOT NULL,
  `idAutor` int(11) NOT NULL,
  `idLivro` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `livro_genero`
--

CREATE TABLE `livro_genero` (
  `id` int(11) NOT NULL,
  `idLivro` int(11) DEFAULT NULL,
  `idGenero` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `analise`
--
ALTER TABLE `analise`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `autor`
--
ALTER TABLE `autor`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `editora`
--
ALTER TABLE `editora`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `filme`
--
ALTER TABLE `filme`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `filme_autor`
--
ALTER TABLE `filme_autor`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idautor` (`idAutor`),
  ADD KEY `idfilme` (`idFilme`);

--
-- Índices para tabela `filme_genero`
--
ALTER TABLE `filme_genero`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idgenero` (`idGenero`),
  ADD KEY `idfilme` (`idFilme`);

--
-- Índices para tabela `genero`
--
ALTER TABLE `genero`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `livro`
--
ALTER TABLE `livro`
  ADD PRIMARY KEY (`id`),
  ADD KEY `itemId` (`itemId`);

--
-- Índices para tabela `livro_autor`
--
ALTER TABLE `livro_autor`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idAutor` (`idAutor`),
  ADD KEY `idLivro` (`idLivro`);

--
-- Índices para tabela `livro_genero`
--
ALTER TABLE `livro_genero`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idgenero` (`idGenero`),
  ADD KEY `idlivro` (`idLivro`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `analise`
--
ALTER TABLE `analise`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `autor`
--
ALTER TABLE `autor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `editora`
--
ALTER TABLE `editora`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `filme`
--
ALTER TABLE `filme`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `filme_autor`
--
ALTER TABLE `filme_autor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `filme_genero`
--
ALTER TABLE `filme_genero`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `genero`
--
ALTER TABLE `genero`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `item`
--
ALTER TABLE `item`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `livro`
--
ALTER TABLE `livro`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `livro_autor`
--
ALTER TABLE `livro_autor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `livro_genero`
--
ALTER TABLE `livro_genero`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `filme_autor`
--
ALTER TABLE `filme_autor`
  ADD CONSTRAINT `filme_autor_ibfk_1` FOREIGN KEY (`idautor`) REFERENCES `autor` (`id`),
  ADD CONSTRAINT `filme_autor_ibfk_2` FOREIGN KEY (`idfilme`) REFERENCES `filme` (`id`);

--
-- Limitadores para a tabela `filme_genero`
--
ALTER TABLE `filme_genero`
  ADD CONSTRAINT `filme_genero_ibfk_1` FOREIGN KEY (`idgenero`) REFERENCES `genero` (`id`),
  ADD CONSTRAINT `filme_genero_ibfk_2` FOREIGN KEY (`idfilme`) REFERENCES `filme` (`id`);

--
-- Limitadores para a tabela `livro`
--
ALTER TABLE `livro`
  ADD CONSTRAINT `livro_ibfk_1` FOREIGN KEY (`itemId`) REFERENCES `item` (`id`);

--
-- Limitadores para a tabela `livro_autor`
--
ALTER TABLE `livro_autor`
  ADD CONSTRAINT `livro_autor_ibfk_1` FOREIGN KEY (`idAutor`) REFERENCES `autor` (`id`),
  ADD CONSTRAINT `livro_autor_ibfk_2` FOREIGN KEY (`idLivro`) REFERENCES `livro` (`id`);

--
-- Limitadores para a tabela `livro_genero`
--
ALTER TABLE `livro_genero`
  ADD CONSTRAINT `livro_genero_ibfk_1` FOREIGN KEY (`idgenero`) REFERENCES `genero` (`id`),
  ADD CONSTRAINT `livro_genero_ibfk_2` FOREIGN KEY (`idlivro`) REFERENCES `livro` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
