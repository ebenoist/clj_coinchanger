(ns coin-changer.core)

(defn largest-coin
  "Get the largest coin"
  [amount]
  (let [possible-coins [25 10 5 1]]
  (apply max (filter (fn [coin] (>= amount coin)) possible-coins))))

(defn change
  "My simple coin changer"
  [amount]
  (cond
    (>= 0 amount) ()
    :else 
    (let [coin (largest-coin amount)]
       (cons coin (change (- amount coin))))))

