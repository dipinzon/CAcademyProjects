'use strict';


/**
 * Put new orders
 * This operation updates the `state` of an order with a matching id from the orders.json file.
 *
 * body String A state string (optional)
 * id String The id of the order.
 * no response value expected for this operation
 **/
exports.update_order = function(body,id) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}

