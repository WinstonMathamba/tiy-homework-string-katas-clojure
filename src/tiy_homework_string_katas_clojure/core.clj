(ns tiy-homework-string-katas-clojure.core)
(require '[clojure.string :as str])

;Clojure String Kata Homework *

; Not String Excercise: Given a string, return a new string
; where "not " has been added to the front. However, if the string
; already begins with "not", return the string unchanged.

(defn not-string [word] (if (str/starts-with? word "not")
                          (str word)
                          (str "not " word)))


;Missing Character -
;Given a non-empty string and an integer, return a new string
;where the character at the specified index has been removed.
;The specified index will be a valid index of in the original string.

(defn missiing-character [word, i] (let [front (subs word 0 i)
                                          back (subs word (+ i 1))]
                                          (str front back)))

;Front Back -
;Given a string, return a new string where the first and last characters have been exchanged.

(defn front-back [word] (let [one (subs word 0, 1)
                              mid (subs word 1, (- (count word) 1))
                              final (subs word (- (count word) 1))]
                              (if (<= (count word) 1)
                               (str word)
                               (str final mid one))))

;Front Three -
;Given a string, we'll say that the front is the first 3
;characters of the string. If the string length is less than 3,
;the front is whatever is there. Return a new string which is 3 copies of the front.

(defn front-three [word] (let [front (subs word 0, 3)]
                              (if (<= (count word) 3)
                               (str word)
                               (str front front front))))

;Back Around
;Given a string, take the last character and return a new string
;with the last character added at the front and back,
;so "cat" yields "tcatt". The original string will be length 1 or more.

(defn back-around [word] (let [lastChar (subs word (- (count word) 1))]
                          (str lastChar word lastChar)))

;Front 22
;Given a string, take the first 2 characters and return the string
;with the 2 characters added at both the front and back, so "kitten" yields"kikittenki".
;If the string length is less than 2, use whatever characters are there.

(defn front-22 [word] (let [frontdeuce (subs word 0, 2)]
                        (str frontdeuce word frontdeuce)))

;Delete Del
;Given a string, if the string "del" appears starting at index 1,
;return a string where that "del" has been deleted. Otherwise, return the string unchanged.

(defn del-del [word] (if (= (subs word 1, 4) "del")
                          (str (subs word 0, 1) (subs word 4))
                          (str word)))

;Start Oz
;Given a string, return a string made of the first 2 characters (if present),
;however include first char only if it is 'o' and include the second only if it is 'z',
;so "ozymandias" yields "oz".

(defn start-oz [word] (cond
                        (and (= (subs word 0, 1) "o") (= (subs word 1, 2) "z")) (str "Example of startOz --> " (subs word 0, 2))
                        (= (subs word 0, 1) "o") (str (subs word 0, 1))
                        (= (subs word 1, 2) "z") (str (subs word 1, 2))
                        :else (str " ")))

;End Up
;Given a string, return a new string where the last 3 characters are now in upper case.
;If the string has less than 3 characters, uppercase whatever is there.

(defn end-up [word] (let [last3 (subs word (- (count word) 3))
                          front (subs word 0, (- (count word) 3))]
                            (str front (str/upper-case last3))))



(defn -main []
  (println "Example of Not String  --> " (not-string "a big deal"))
  (println "Example of Not String  --> " (not-string "nottingham"))
  (println "Example of Not String  --> " (not-string "North"))
  (println "Example of Not String  --> " (not-string "Candy"))
  (println "Example of Not String  --> " (not-string "x"))
  (println "Example of Not String  --> " (not-string "not bad"))
  (println)

  (println "Eample of Missing Character --> "(missiing-character "rolling", 4))
  (println "Eample of Missing Character --> "(missiing-character "cascade", 2))
  (println "Eample of Missing Character --> "(missiing-character "slow", 3))
  (println "Eample of Missing Character --> "(missiing-character "kitten", 0))
  (println "Eample of Missing Character --> "(missiing-character "kitten", 5))
  (println "Eample of Missing Character --> "(missiing-character "kitten", 4))
  (println)

  (println "Example of Front Back --> "(front-back "reverse"))
  (println "Example of Front Back --> " (front-back "hello"))
  (println "Example of Front Back --> " (front-back "code"))
  (println "Example of Front Back --> " (front-back "hi"))
  (println "Example of Front Back --> " (front-back "ab"))
  (println "Example of Front Back --> " (front-back "hotblooded"))
  (println)

  (println "Example of Front Three-> " (front-three "java"))
  (println "Example of Front Three-> " (front-three "chocolate"))
  (println "Example of Front Three-> " (front-three "abc"))
  (println "Example of Front Three-> " (front-three "helium"))
  (println "Example of Front Three-> " (front-three "baloon"))
  (println "Example of Front Three-> " (front-three "heavy"))
  (println)

  (println "Example of Back Around --> "  (back-around "lady"))
  (println "Example of Back Around --> " (back-around "cat"))
  (println "Example of Back Around --> " (back-around "hello"))
  (println "Example of Back Around --> " (back-around "vericose"))
  (println "Example of Back Around --> " (back-around "a"))
  (println "Example of Back Around --> " (back-around "moody"))
  (println)

  (println "Example of Front 22 --> " (front-22 "follow"))
  (println "Example of Front 22 --> " (front-22 "kitten"))
  (println "Example of Front 22 --> " (front-22 "ha"))
  (println "Example of Front 22 --> " (front-22 "abc"))
  (println "Example of Front 22 --> " (front-22 "shadow"))
  (println "Example of Front 22 --> " (front-22 "million"))
  (println)

  (println "Example of Deldel --> "(del-del "adele"))
  (println "Example of Deldel --> "(del-del "hdelello"))
  (println "Example of Deldel --> "(del-del "adelbc"))
  (println "Example of Deldel --> "(del-del "ideal"))
  (println "Example of Deldel --> "(del-del "pdelarty"))
  (println "Example of Deldel --> "(del-del "spdelecial"))
  (println)

  (println "Example of startOz --> " (start-oz "ozymandias"))
  (println "Example of startOz --> " (start-oz "bzoo"))
  (println "Example of startOz --> " (start-oz "oxxx"))
  (println "Example of startOz --> " (start-oz "tropical"))
  (println "Example of startOz --> " (start-oz "wo"))
  (println "Example of startOz --> " (start-oz "zolies"))
  (println)

  (println "Example of End Up --> "(end-up "hello"))
  (println "Example of End Up --> "(end-up "hi there"))
  (println "Example of End Up --> "(end-up "so tired"))
  (println "Example of End Up --> "(end-up "won't work"))
  (println "Example of End Up --> "(end-up "good enough"))
  (println "Example of End Up --> "(end-up "betten than")))

(-main)
