(ns tiy-homework-string-katas-clojure.core)
(require '[clojure.string :as str])

;Clojure String Kata Homework *

; Not String Excercise: Given a string, return a new string
; where "not " has been added to the front. However, if the string
; already begins with "not", return the string unchanged.

(defn notString [word] (str "Example of Not String  --> "
                       (if (str/starts-with? word "not")
                       (str word)
                       (str "not " word))))


;Missing Character -
;Given a non-empty string and an integer, return a new string
;where the character at the specified index has been removed.
;The specified index will be a valid index of in the original string.

(defn missiingCharacter [word, om] (def front (subs word 0 om))
                                   (def back (subs word (+ om 1)))
                                   (str "Eample of Missing Character --> " front back))

;Front Back -
;Given a string, return a new string where the first and last characters have been exchanged.

(defn frontBack [word]  (def one (subs word 0, 1))
                        (def mid (subs word 1, (- (count word) 1)))
                        (def final (subs word (- (count word) 1)))
                          (if (<= (count word) 1)
                           (str "Example of Front Back --> " word)
                           (str "Example of Front Back --> " final mid one)))

;Front Three -
;Given a string, we'll say that the front is the first 3
;characters of the string. If the string length is less than 3,
;the front is whatever is there. Return a new string which is 3 copies of the front.

(defn frontThree [word] (def front (subs word 0,3))
                          (if (<= (count word) 3)
                            (str "Example of Front Three-> " word)
                            (str "Example of Front Three-> " front front front)))


(defn -main []
  (println (notString "a big deal"))
  (println (notString "nottingham"))
  (println (notString "North"))
  (println (notString "Candy"))
  (println (notString "x"))
  (println (notString "not bad"))
  (println)

  (println (missiingCharacter "rolling", 4))
  (println (missiingCharacter "cascade", 2))
  (println (missiingCharacter "slow", 3))
  (println (missiingCharacter "kitten", 0))
  (println (missiingCharacter "kitten", 5))
  (println (missiingCharacter "kitten", 4))
  (println)

  (println (frontBack "reverse"))
  (println (frontBack "hello"))
  (println (frontBack "code"))
  ;(println (frontBack "A"))
  (println (frontBack "ab"))
  (println (frontBack "hotblooded"))
  (println)

  (println (frontThree "java"))
  (println (frontThree "chocolate"))
  (println (frontThree "abc"))
  (println (frontThree "helium"))
  (println (frontThree "baloon"))
  (println (frontThree "")))


(-main)
