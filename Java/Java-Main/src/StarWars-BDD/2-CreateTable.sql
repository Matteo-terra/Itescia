CREATE TABLE `films` (
  `id` int(11) NOT NULL,
  `titre` varchar(20) NOT NULL,
  `anneeDeSortie` varchar(20) NOT NULL,
  `numeroEpisode` int(20) NOT NULL,
  `cout` double NOT NULL,
  `recette` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `films_acteurs` (
  `id` int(11) NOT NULL,
  `films_id` int(11) NOT NULL,
  `acteurs_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `acteurs` (
  `id` int(11) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `acteurs_personnages` (
  `id` int(11) NOT NULL,
  `acteurs_id` int(11) NOT NULL,
  `personnages_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `personnages` (
  `id` int(11) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `films`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `films_acteurs`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `acteurs`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `acteurs_personnages`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `personnages`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `films`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

ALTER TABLE `films_acteurs`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

ALTER TABLE `acteurs`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

ALTER TABLE `acteurs_personnages`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

ALTER TABLE `personnages`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

ALTER TABLE `films_acteurs`
  ADD FOREIGN KEY (`films_id`) REFERENCES `films` (`id`),
  ADD FOREIGN KEY (`acteurs_id`) REFERENCES `acteurs` (`id`);

ALTER TABLE `acteurs_personnages`
  ADD FOREIGN KEY (`acteurs_id`) REFERENCES `acteurs` (`id`),
  ADD FOREIGN KEY (`personnages_id`) REFERENCES `personnages` (`id`);
  