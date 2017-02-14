;; Barber _Bayesian Reasoning and Machine Learning_ example 11.2

(ns freemlexp.em-barber11-2
  (:use ;[clojure.math.numeric-tower :only [expt]]
        [clojure.algo.generic.math-functions :only [sqr exp]]))

(defn e-step
  "Performs the E step: Given a scalar datum v and scalar parameter theta,
  returns probability estimates q(1) and q(2) as a pair."
  [v theta]
  (let [p-v|h&theta (fn [v theta h]
                      (exp (- (sqr 
                                (- v 
                                   (* h theta))))))
        p1 (p-v|h&theta v theta 1)
        p2 (p-v|h&theta v theta 2)
        numer (+ p1 p2)]
    [(/ p1 numer) (/ p2 numer)]))

(def es (partial e-step 2.75))
