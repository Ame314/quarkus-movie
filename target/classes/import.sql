-- SQL script to initialize the database with sample data for the movie application

-- Insert sample movies
INSERT INTO movie (id, title, genre) VALUES
(1, 'Inception', 'Science Fiction'),
(2, 'The Godfather', 'Crime'),
(3, 'Pulp Fiction', 'Drama');

-- Insert sample critics
INSERT INTO critic (id, name, affiliation) VALUES
(1, 'Roger Ebert', 'Chicago Sun-Times'),
(2, 'Peter Travers', 'Rolling Stone'),
(3, 'Richard Roeper', 'Chicago Sun-Times');

-- Insert sample reviews
INSERT INTO review (id, content, rating, movie_id, critic_id) VALUES
(1, 'A mind-bending thriller that will leave you questioning reality.', 5, 1, 1),
(2, 'A timeless classic that redefined the gangster genre.', 5, 2, 2),
(3, 'An innovative and stylish film that is a must-see.', 4, 1, 3);