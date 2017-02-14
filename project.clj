(defproject freemlexp "0.1.0-SNAPSHOT"
  :description "Miscellaneous machine learning, free energy, etc. experiments"
  :url "https://github.com/mars0i/freemlexp"
  :license {:name "Gnu General Public License version 3.0"
            :url "http://www.gnu.org/copyleft/gpl.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha14"]
                 ;[org.clojure/clojure "1.8.0"]
                 [org.clojure/math.numeric-tower "0.0.4"]
                 [org.clojure/algo.generic "0.1.2"] ; for algo.generic.math-functions and maybe fmap
                 [incanter "1.5.7"]]
  :main ^:skip-aot freemlexp.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
