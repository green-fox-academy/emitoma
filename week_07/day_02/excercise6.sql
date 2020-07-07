-- For all cases where the same reviewer rated the same movie twice and gave it a higher rating the second time,
--  return the reviewer’s name and the title of the movie.

CREATE TEMPORARY TABLE temp1 SELECT mID, rID FROM rating
GROUP BY mID, rID
HAVING COUNT(mID) = 2 ;


CREATE TEMPORARY TABLE temp2 SELECT mID FROM rating
GROUP BY mID, rID
ORDER BY ratingDate DESC;

CREATE TEMPORARY TABLE temp3 SELECT mID FROM rating
GROUP BY mID, rID
ORDER BY stars DESC;

SELECT DISTINCT
   reviewer.name, movie.title
FROM
    temp1
        INNER JOIN
    temp2 ON temp1.mID = temp2.mID
        INNER JOIN
    temp3 ON temp1.mID = temp3.mID
        INNER JOIN
    reviewer ON temp1.rID = reviewer.rID
        INNER JOIN
    movie ON temp1.mID = movie.mID;





