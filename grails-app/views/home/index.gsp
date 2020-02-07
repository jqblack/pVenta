<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Menube web</title>
</head>
<body>

    <div class="row">
        <div class="col-sm-6 col-lg-6">
            <div class="card text-white bg-primary">
                <div class="card-body pb-0">
                    <div class="btn-group float-right">
                        %{--<button class="btn btn-transparent dropdown-toggle p-0" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">--}%
                            %{--<i class="icon-settings"></i>--}%
                        %{--</button>--}%
                        %{--<div class="dropdown-menu dropdown-menu-right">--}%
                            %{--<a class="dropdown-item" href="#">Action</a>--}%
                            %{--<a class="dropdown-item" href="#">Another action</a>--}%
                            %{--<a class="dropdown-item" href="#">Something else here</a>--}%
                        %{--</div>--}%
                    </div>
                    <div class="text-value" id="ventasTotales">0.00</div>
                    <div>Total en ventas</div>
                </div>
                <div class="chart-wrapper mt-3 mx-3" style="height:70px;">
                    <canvas class="chart" id="totalVentas" height="70"></canvas>
                </div>
            </div>
        </div>

        <div class="col-sm-6 col-lg-6">
            <div class="card text-white bg-info">
                <div class="card-body pb-0">
                    <button class="btn btn-transparent p-0 float-right" type="button">
                        <i class="icon-location-pin"></i>
                    </button>
                    <div class="text-value" id="totalVentasDelivery" >0.00</div>
                    <div>Total en ventas de delivery</div>
                </div>
                <div class="chart-wrapper mt-3 mx-3" style="height:70px;">
                    <canvas class="chart" id="ventasDelivery" height="70"></canvas>
                </div>
            </div>
        </div>

        %{--<div class="col-sm-6 col-lg-3">--}%
            %{--<div class="card text-white bg-warning">--}%
                %{--<div class="card-body pb-0">--}%
                    %{--<button class="btn btn-transparent p-0 float-right" type="button">--}%
                        %{--<i class="icon-location-pin"></i>--}%
                    %{--</button>--}%
                    %{--<div class="text-value">9.823</div>--}%
                    %{--<div>Total ventas</div>--}%
                %{--</div>--}%
                %{--<div class="chart-wrapper mt-3 mx-3" style="height:70px;">--}%
                    %{--<canvas class="chart" id="card-chart2" height="70"></canvas>--}%
                %{--</div>--}%
            %{--</div>--}%
        %{--</div>--}%
    </div>
    <div class="row">
        <div class="col-md-6 col-12 col-xl-6">
            <div class="card">
                <div class="card-header">
                    Ventas
                    <div class="card-header-actions">

                    </div>
                </div>
                <div class="card-body">
                    <div class="chart-wrapper">
                        <canvas id="canvas-2"></canvas>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-md-6 col-12 col-xl-6">
            <div class="card">
                <div class="card-header">
                    Ventas Delivery
                    <div class="card-header-actions">

                    </div>
                </div>
                <div class="card-body">
                    <div class="chart-wrapper">
                        <canvas id="ventas-delivery"></canvas>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-6 col-12 col-xl-12">
            <div class="card">
                <div class="card-header">
                    Totales de ventas
                    <div class="card-header-actions">

                    </div>
                </div>
                <div class="card-body">
                    <div class="chart-wrapper">
                        <canvas id="montoVentasAnoEnCurso"></canvas>
                    </div>
                </div>
            </div>
        </div>
    </div>


<asset:javascript src="chart.js"/>
<asset:javascript src="home.js"/>

</body>
</html>
