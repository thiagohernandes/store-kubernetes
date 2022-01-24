# store-kubernetes
Kubernetes HPA (products and orders)

## Architecture

  - The project has integration between two microservices: products and orders;
  - Orders has a client to return a product by id;
  - Both of then are deployed on Kubernetes using HPA - Horizontal Pod Autoscaler;
  - Ilustration:
  

## Steps

  Before: install Minikube/Kubernetes on local machine

  1 - git clone https://github.com/thiagohernandes/store-kubernetes
  2 - cd store-kubernetes/store-products/kubernetes 
  3 - kubectl apply -f .
  4 - cd store-kubernetes/store-orders/kubernetes 
  5 - kubectl apply -f .
