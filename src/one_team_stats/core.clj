(ns one-team-stats.core
  (:require [clj-http.client :as client])
  (:gen-class))

(def year "2019")
(def league-id "803723")

(def url (str "https://fantasy.espn.com/apis/v3/games/ffl/seasons/"
              year
              "/segments/0/leagues/"
              league-id
              "?view=mMatchup&view=mMatchupScore"))

(defn make-request
  []
  (println (client/get url)))

(defn -main
  "Get json and print it"
  [& args]
  (make-request))
