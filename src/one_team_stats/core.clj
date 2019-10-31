(ns one-team-stats.core
  (:require [clj-http.client :as client])
  (:gen-class))

(def url "https://fantasy.espn.com/apis/v3/games/ffl/seasons/2019/segments/0/leagues/803723?view=mMatchup&view=mMatchupScore")

(defn make-request
  []
  (println (client/get url)))

(defn -main
  "Get json and print it"
  [& args]
  (make-request))
