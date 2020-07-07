-- USE movies;
-- SELECT * FROM movie;
-- SELECT title FROM movie WHERE director = "Steven Spielberg";
-- SELECT * FROM  movie, rating, reviewer;
-- SELECT DISTINCT movie.year FROM movie LEFT JOIN rating ON movie.mID = rating.mID 
-- WHERE rating.stars BETWEEN 4 AND 5 
-- ORDER BY movie.year ASC;

SELECT DISTINCT movie.year FROM movie LEFT JOIN rating ON movie.mID = rating.mID 
WHERE rating.stars BETWEEN 4 AND 5 
ORDER BY movie.year ASC;

SELECT movie.title FROM movie WHERE 