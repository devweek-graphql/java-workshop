-- load abilities
INSERT INTO ABILITIES (NAME, DESCRIPTION) VALUES ('Strength', 'Super-human strength');
INSERT INTO ABILITIES (NAME, DESCRIPTION) VALUES ('Speed', 'Ability to run faster than a normal human being');
INSERT INTO ABILITIES (NAME, DESCRIPTION) VALUES ('Flight', 'Ability to fly');
INSERT INTO ABILITIES (NAME, DESCRIPTION) VALUES ('Agility', 'Ability to move quicky and easily');
INSERT INTO ABILITIES (NAME, DESCRIPTION) VALUES ('Transformation', 'Ability to transform its body');
INSERT INTO ABILITIES (NAME, DESCRIPTION) VALUES ('Energy', 'Ability to manipulate energy');
INSERT INTO ABILITIES (NAME, DESCRIPTION) VALUES ('Teleportation', 'Ability to teleport from one place to another');
INSERT INTO ABILITIES (NAME, DESCRIPTION) VALUES ('Fight', 'Ability to fight');
INSERT INTO ABILITIES (NAME, DESCRIPTION) VALUES ('Telepathy', 'Ability to communicate using its mind');
INSERT INTO ABILITIES (NAME, DESCRIPTION) VALUES ('Invisibility', 'Ability to became invisible');

-- load teams
-- DC
INSERT INTO TEAMS (NAME, DESCRIPTION) VALUES ('Birds of Prey', 'A femme force to be reckoned with');
INSERT INTO TEAMS (NAME, DESCRIPTION) VALUES ('Doom Patrol', 'Group of super-powered misfits');
INSERT INTO TEAMS (NAME, DESCRIPTION) VALUES ('Green Lantern Corps', 'Intergalactic police force');
INSERT INTO TEAMS (NAME, DESCRIPTION) VALUES ('Justice League', 'Earth''s premiere team of champions');
INSERT INTO TEAMS (NAME, DESCRIPTION) VALUES ('Suicide Squad', 'A group of super-villains who have license to take drastic action');
INSERT INTO TEAMS (NAME, DESCRIPTION) VALUES ('Teen Titans', 'Group of teenage superheroes');
-- Marvel
INSERT INTO TEAMS (NAME, DESCRIPTION) VALUES ('Avengers', 'Group of extraordinary individuals');
INSERT INTO TEAMS (NAME, DESCRIPTION) VALUES ('X-Force', 'A mutant strike team that would take a more proactive stance against threats to mutantkind');
INSERT INTO TEAMS (NAME, DESCRIPTION) VALUES ('X-Men', 'Mutants gathered by Charles Xavier');
INSERT INTO TEAMS (NAME, DESCRIPTION) VALUES ('Fantastic Four', 'They might be super heroes, but they are a family first');
INSERT INTO TEAMS (NAME, DESCRIPTION) VALUES ('Guardians of the Galaxy', 'A group of intergalactic outlaws, turned unlikely saviors of the galaxy');
INSERT INTO TEAMS (NAME, DESCRIPTION) VALUES ('Inhumans', 'The Inhumans are a race of people who were created as a result of a Kree science experiment');

-- load first appearances

INSERT INTO FIRST_APPEARANCES (COMIC_NAME, YEAR) VALUES ('Journey Into Mistery #83', '1962'); -- thor
INSERT INTO FIRST_APPEARANCES (COMIC_NAME, YEAR) VALUES ('Tales of Suspense #39', '1963'); -- iron man
INSERT INTO FIRST_APPEARANCES (COMIC_NAME, YEAR) VALUES ('Batman: The Animated Series', '1992'); -- harley quinn
INSERT INTO FIRST_APPEARANCES (COMIC_NAME, YEAR) VALUES ('My Greatest Adventure #80', '1963'); -- negative man, robotman, elasticgirl
INSERT INTO FIRST_APPEARANCES (COMIC_NAME, YEAR) VALUES ('All-American Comics #16', '1940'); -- green lantern
INSERT INTO FIRST_APPEARANCES (COMIC_NAME, YEAR) VALUES ('Action Comics #1', '1938'); -- superman
INSERT INTO FIRST_APPEARANCES (COMIC_NAME, YEAR) VALUES ('All Star Comics #8', '1941'); -- wonder woman
INSERT INTO FIRST_APPEARANCES (COMIC_NAME, YEAR) VALUES ('DC Comics Presents #26', '1980'); -- Cyborg
INSERT INTO FIRST_APPEARANCES (COMIC_NAME, YEAR) VALUES ('The Flash #1', '1940'); -- flash
INSERT INTO FIRST_APPEARANCES (COMIC_NAME, YEAR) VALUES ('Legends #1', '1986'); -- amanda waller
INSERT INTO FIRST_APPEARANCES (COMIC_NAME, YEAR) VALUES ('Strange Adventures #187', '1966'); -- Enchantress (suicide squad)
INSERT INTO FIRST_APPEARANCES (COMIC_NAME, YEAR) VALUES ('Detective Comics #38', '1940'); -- robin/nightwing (teen titans)
INSERT INTO FIRST_APPEARANCES (COMIC_NAME, YEAR) VALUES ('The Flash #110', '1959'); -- Kid flash (teen titans)
INSERT INTO FIRST_APPEARANCES (COMIC_NAME, YEAR) VALUES ('Adventure Comics #269', '1960'); -- aqualad (teen titans)
INSERT INTO FIRST_APPEARANCES (COMIC_NAME, YEAR) VALUES ('Wonder Woman #23', '1947'); -- wonder girl (teen titans)
INSERT INTO FIRST_APPEARANCES (COMIC_NAME, YEAR) VALUES ('Uncanny X-Men #201', '1986'); -- cable (xforce)
INSERT INTO FIRST_APPEARANCES (COMIC_NAME, YEAR) VALUES ('X-Men #1', '1963'); -- charles xavier
INSERT INTO FIRST_APPEARANCES (COMIC_NAME, YEAR) VALUES ('Uncanny X-Men #1', '1963'); -- ciclops, jean grey
INSERT INTO FIRST_APPEARANCES (COMIC_NAME, YEAR) VALUES ('Fantastic Four #1', '1961'); -- mr fantastico, invisible girl
INSERT INTO FIRST_APPEARANCES (COMIC_NAME, YEAR) VALUES ('Fantastic Four #5', '1962'); -- doctor doom
INSERT INTO FIRST_APPEARANCES (COMIC_NAME, YEAR) VALUES ('Strange Tales #180', '1975'); -- gamora
INSERT INTO FIRST_APPEARANCES (COMIC_NAME, YEAR) VALUES ('Avengers #257', '1985'); -- nebula
INSERT INTO FIRST_APPEARANCES (COMIC_NAME, YEAR) VALUES ('Fantastic Four #45', '1965'); -- black bolt
INSERT INTO FIRST_APPEARANCES (COMIC_NAME, YEAR) VALUES ('Fantastic Four #36', '1965'); -- medusa

-- load characters
INSERT INTO CHARACTERS (NAME, TYPE, UNIVERSE, FIRST_APPEARANCE_ID, CHARACTER_AVATAR) VALUES ('Thor', 'HERO', 'MARVEL', 'Journey Into Mistery #83', './assets/avatars/thor.jpg');
INSERT INTO CHARACTERS (NAME, TYPE, UNIVERSE, FIRST_APPEARANCE_ID, CHARACTER_AVATAR) VALUES ('Iron Man', 'HERO', 'MARVEL', 'Tales of Suspense #39', './assets/avatars/iron-man.jpg');
INSERT INTO CHARACTERS (NAME, TYPE, UNIVERSE, FIRST_APPEARANCE_ID, CHARACTER_AVATAR) VALUES ('Harley Quinn', 'ANTIHERO', 'DC', 'Batman: The Animated Series', './assets/avatars/harley-quinn.jpg');
INSERT INTO CHARACTERS (NAME, TYPE, UNIVERSE, FIRST_APPEARANCE_ID, CHARACTER_AVATAR) VALUES ('Negative Man', 'HERO', 'DC', 'My Greatest Adventure #80', './assets/avatars/negative-man.jpg');
INSERT INTO CHARACTERS (NAME, TYPE, UNIVERSE, FIRST_APPEARANCE_ID, CHARACTER_AVATAR) VALUES ('Elasti-Girl', 'HERO', 'DC', 'My Greatest Adventure #80', './assets/avatars/elasti-girl.jpg');
INSERT INTO CHARACTERS (NAME, TYPE, UNIVERSE, FIRST_APPEARANCE_ID, CHARACTER_AVATAR) VALUES ('Green Lantern', 'HERO', 'DC', 'All-American Comics #16', './assets/avatars/green-lantern.jpg');
INSERT INTO CHARACTERS (NAME, TYPE, UNIVERSE, FIRST_APPEARANCE_ID, CHARACTER_AVATAR) VALUES ('Superman', 'HERO', 'DC', 'Action Comics #1', './assets/avatars/superman.jpg');
INSERT INTO CHARACTERS (NAME, TYPE, UNIVERSE, FIRST_APPEARANCE_ID, CHARACTER_AVATAR) VALUES ('Wonder Woman', 'HERO', 'DC', 'All Star Comics #8', './assets/avatars/wonder-woman.jpg');
INSERT INTO CHARACTERS (NAME, TYPE, UNIVERSE, FIRST_APPEARANCE_ID, CHARACTER_AVATAR) VALUES ('Cyborg', 'HERO', 'DC', 'DC Comics Presents #26', './assets/avatars/cyborg.jpg');
INSERT INTO CHARACTERS (NAME, TYPE, UNIVERSE, FIRST_APPEARANCE_ID, CHARACTER_AVATAR) VALUES ('Flash', 'HERO', 'DC', 'The Flash #1', './assets/avatars/flash.jpg');
INSERT INTO CHARACTERS (NAME, TYPE, UNIVERSE, FIRST_APPEARANCE_ID, CHARACTER_AVATAR) VALUES ('Amanda Waller', 'VILLAIN', 'DC', 'Legends #1', './assets/avatars/amanda-waller.jpg');
INSERT INTO CHARACTERS (NAME, TYPE, UNIVERSE, FIRST_APPEARANCE_ID, CHARACTER_AVATAR) VALUES ('Enchantress', 'ANTIHERO', 'DC', 'Strange Adventures #187', './assets/avatars/enchantress.jpg');
INSERT INTO CHARACTERS (NAME, TYPE, UNIVERSE, FIRST_APPEARANCE_ID, CHARACTER_AVATAR) VALUES ('Robin', 'HERO', 'DC', 'Detective Comics #38', './assets/avatars/robin.jpg');
INSERT INTO CHARACTERS (NAME, TYPE, UNIVERSE, FIRST_APPEARANCE_ID, CHARACTER_AVATAR) VALUES ('Kid Flash', 'HERO', 'DC', 'The Flash #110', './assets/avatars/kid-flash.jpg');
INSERT INTO CHARACTERS (NAME, TYPE, UNIVERSE, FIRST_APPEARANCE_ID, CHARACTER_AVATAR) VALUES ('Aqualad', 'HERO', 'DC', 'Adventure Comics #269', './assets/avatars/aqualad.jpg');
INSERT INTO CHARACTERS (NAME, TYPE, UNIVERSE, FIRST_APPEARANCE_ID, CHARACTER_AVATAR) VALUES ('Wonder Girl', 'HERO', 'DC', 'Wonder Woman #23', './assets/avatars/wonder-girl.jpg');
INSERT INTO CHARACTERS (NAME, TYPE, UNIVERSE, FIRST_APPEARANCE_ID, CHARACTER_AVATAR) VALUES ('Cable', 'ANTIHERO', 'MARVEL', 'Uncanny X-Men #201', './assets/avatars/cable.jpg');
INSERT INTO CHARACTERS (NAME, TYPE, UNIVERSE, FIRST_APPEARANCE_ID, CHARACTER_AVATAR) VALUES ('Charles Xavier', 'HERO', 'MARVEL', 'X-Men #1', './assets/avatars/charles-xavier.jpg');
INSERT INTO CHARACTERS (NAME, TYPE, UNIVERSE, FIRST_APPEARANCE_ID, CHARACTER_AVATAR) VALUES ('Cyclops', 'HERO', 'MARVEL', 'Uncanny X-Men #1', './assets/avatars/cyclops.jpg');
INSERT INTO CHARACTERS (NAME, TYPE, UNIVERSE, FIRST_APPEARANCE_ID, CHARACTER_AVATAR) VALUES ('Jean Grey', 'ANTIHERO', 'MARVEL', 'Uncanny X-Men #1', './assets/avatars/jean-grey.jpg');
INSERT INTO CHARACTERS (NAME, TYPE, UNIVERSE, FIRST_APPEARANCE_ID, CHARACTER_AVATAR) VALUES ('Mr Fantastic', 'HERO', 'MARVEL', 'Fantastic Four #1', './assets/avatars/mr-fantastic.jpg');
INSERT INTO CHARACTERS (NAME, TYPE, UNIVERSE, FIRST_APPEARANCE_ID, CHARACTER_AVATAR) VALUES ('Invisible Woman', 'HERO', 'MARVEL', 'Fantastic Four #1', './assets/avatars/invisible-woman.jpg');
INSERT INTO CHARACTERS (NAME, TYPE, UNIVERSE, FIRST_APPEARANCE_ID, CHARACTER_AVATAR) VALUES ('Doctor Doom', 'VILLAIN', 'MARVEL', 'Fantastic Four #5', './assets/avatars/doctor-doom.jpg');
INSERT INTO CHARACTERS (NAME, TYPE, UNIVERSE, FIRST_APPEARANCE_ID, CHARACTER_AVATAR) VALUES ('Gamora', 'HERO', 'MARVEL', 'Strange Tales #180', './assets/avatars/gamora.jpg');
INSERT INTO CHARACTERS (NAME, TYPE, UNIVERSE, FIRST_APPEARANCE_ID, CHARACTER_AVATAR) VALUES ('Nebula', 'HERO', 'MARVEL', 'Fantastic Four #45', './assets/avatars/nebula.jpg');
INSERT INTO CHARACTERS (NAME, TYPE, UNIVERSE, FIRST_APPEARANCE_ID, CHARACTER_AVATAR) VALUES ('Black Bolt', 'HERO', 'MARVEL', 'Fantastic Four #45', './assets/avatars/black-bolt.jpg');
INSERT INTO CHARACTERS (NAME, TYPE, UNIVERSE, FIRST_APPEARANCE_ID, CHARACTER_AVATAR) VALUES ('Medusa', 'HERO', 'MARVEL', 'Fantastic Four #36', './assets/avatars/medusa.jpg');

-- load characters abilities
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Thor', 'Strength');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Thor', 'Flight');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Iron Man', 'Strength');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Iron Man', 'Flight');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Harley Quinn', 'Agility');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Negative Man', 'Flight');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Elasti-Girl', 'Transformation');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Green Lantern', 'Energy');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Superman', 'Strength');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Superman', 'Speed');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Superman', 'Flight');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Wonder Woman', 'Strength');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Cyborg', 'Strength');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Cyborg', 'Flight');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Flash', 'Speed');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Enchantress', 'Teleportation');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Enchantress', 'Flight');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Robin', 'Fight');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Kid Flash', 'Speed');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Aqualad', 'Fight');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Wonder Girl', 'Strength');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Wonder Girl', 'Flight');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Cable', 'Telepathy');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Charles Xavier', 'Telepathy');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Cyclops', 'Energy');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Jean Grey', 'Telepathy');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Mr Fantastic', 'Transformation');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Invisible Woman', 'Invisibility');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Doctor Doom', 'Energy');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Gamora', 'Strength');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Gamora', 'Speed');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Gamora', 'Fight');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Nebula', 'Fight');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Black Bolt', 'Strength');
INSERT INTO CHARACTER_ABILITIES (CHARACTER_NAME, ABILIITY_NAME) VALUES ('Medusa', 'Transformation');

-- load characters alies
INSERT INTO CHARACTER_ALLIES (CHARACTER_NAME, ALLY_NAME) VALUES ('Enchantress', 'Amanda Waller');
INSERT INTO CHARACTER_ALLIES (CHARACTER_NAME, ALLY_NAME) VALUES ('Harley Quinn', 'Amanda Waller');
INSERT INTO CHARACTER_ALLIES (CHARACTER_NAME, ALLY_NAME) VALUES ('Gamora', 'Nebula');
INSERT INTO CHARACTER_ALLIES (CHARACTER_NAME, ALLY_NAME) VALUES ('Invisible Woman', 'Mr Fantastic');
INSERT INTO CHARACTER_ALLIES (CHARACTER_NAME, ALLY_NAME) VALUES ('Jean Grey', 'Cyclops');


-- load characters teams
INSERT INTO CHARACTER_TEAMS (CHARACTER_NAME, TEAM_NAME) VALUES ('Thor', 'Avengers');
INSERT INTO CHARACTER_TEAMS (CHARACTER_NAME, TEAM_NAME) VALUES ('Iron Man', 'Avengers');
INSERT INTO CHARACTER_TEAMS (CHARACTER_NAME, TEAM_NAME) VALUES ('Harley Quinn', 'Birds of Prey');
INSERT INTO CHARACTER_TEAMS (CHARACTER_NAME, TEAM_NAME) VALUES ('Negative Man', 'Doom Patrol');
INSERT INTO CHARACTER_TEAMS (CHARACTER_NAME, TEAM_NAME) VALUES ('Elasti-Girl', 'Doom Patrol');
INSERT INTO CHARACTER_TEAMS (CHARACTER_NAME, TEAM_NAME) VALUES ('Green Lantern', 'Green Lantern Corps');
INSERT INTO CHARACTER_TEAMS (CHARACTER_NAME, TEAM_NAME) VALUES ('Superman', 'Justice League');
INSERT INTO CHARACTER_TEAMS (CHARACTER_NAME, TEAM_NAME) VALUES ('Wonder Woman', 'Justice League');
INSERT INTO CHARACTER_TEAMS (CHARACTER_NAME, TEAM_NAME) VALUES ('Cyborg', 'Justice League');
INSERT INTO CHARACTER_TEAMS (CHARACTER_NAME, TEAM_NAME) VALUES ('Flash', 'Justice League');
INSERT INTO CHARACTER_TEAMS (CHARACTER_NAME, TEAM_NAME) VALUES ('Enchantress', 'Suicide Squad');
INSERT INTO CHARACTER_TEAMS (CHARACTER_NAME, TEAM_NAME) VALUES ('Robin', 'Teen Titans');
INSERT INTO CHARACTER_TEAMS (CHARACTER_NAME, TEAM_NAME) VALUES ('Kid Flash', 'Teen Titans');
INSERT INTO CHARACTER_TEAMS (CHARACTER_NAME, TEAM_NAME) VALUES ('Aqualad', 'Teen Titans');
INSERT INTO CHARACTER_TEAMS (CHARACTER_NAME, TEAM_NAME) VALUES ('Wonder Girl', 'Teen Titans');
INSERT INTO CHARACTER_TEAMS (CHARACTER_NAME, TEAM_NAME) VALUES ('Cable', 'X-Force');
INSERT INTO CHARACTER_TEAMS (CHARACTER_NAME, TEAM_NAME) VALUES ('Charles Xavier', 'X-Men');
INSERT INTO CHARACTER_TEAMS (CHARACTER_NAME, TEAM_NAME) VALUES ('Cyclops', 'X-Men');
INSERT INTO CHARACTER_TEAMS (CHARACTER_NAME, TEAM_NAME) VALUES ('Jean Grey', 'X-Men');
INSERT INTO CHARACTER_TEAMS (CHARACTER_NAME, TEAM_NAME) VALUES ('Mr Fantastic', 'Fantastic Four');
INSERT INTO CHARACTER_TEAMS (CHARACTER_NAME, TEAM_NAME) VALUES ('Invisible Woman', 'Fantastic Four');
INSERT INTO CHARACTER_TEAMS (CHARACTER_NAME, TEAM_NAME) VALUES ('Gamora', 'Guardians of the Galaxy');
INSERT INTO CHARACTER_TEAMS (CHARACTER_NAME, TEAM_NAME) VALUES ('Nebula', 'Guardians of the Galaxy');
INSERT INTO CHARACTER_TEAMS (CHARACTER_NAME, TEAM_NAME) VALUES ('Black Bolt', 'Inhumans');
INSERT INTO CHARACTER_TEAMS (CHARACTER_NAME, TEAM_NAME) VALUES ('Medusa', 'Inhumans');
